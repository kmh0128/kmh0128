SpringBootJPA적용하기
====

>SpringBootJPA적용하기
>        >일단 첫번째로 build.gradle에 org.springframework.boot:spring-boot-starter-data-jpa와 com.h2database:h2 의존성을 등록합니다.

dependencies {
	implementation('org.springframework.boot:spring-boot-starter-data-jpa')//1.
	implementation('com.h2database:h2')//2.인메모리 관계형 데이터 베이스 버전 7.0이상부터는 implementation compile대신 사용
}

일단 첫번째로 자신은 책을보고 공부중이라 처음에 implementation 대신 2.1.7버전 책을 기준으로 코드를 공부해서 처음에 오류가 났다

오류명 Could not find method compile() for arguments [org.springframework:spring-context:5.0.2.RELEASE] on object of type org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyHandler.

compile, runtime, testCompile, testRuntime 은 Gradle 4.10 (2018.8.27) 이래로
deprecate 되었다.
그리고 Gradle 7.0 (2021.4.9) 부터 삭제되었다고 한다 그래서

 Gradle 7.4.1 을 이용하고 있어서 삭제된 명령을 사용했으므로 오류가 발생했었다.
삭제된 네 명령은 각각 implementation, runtimeOnly, testImplementation, testRuntimeOnly 으로 대체되었다.
따라서 compile 을 implementation 으로 수정하여 오류를 해결했고 위의 코드가 되었습니다.


1.spring-boot-starter-data-jpa
=====

스프링부트용 Spring Data Jpa 추상화 라이브러리입니다.

스프링 부트 버전에 맞춰 자동으로 JPA 관련 라이브러리들의 버전을 관리해줍니다.


2.h2
=====

-인메모리 관계형 데이터 베이스입니다.

-별도의 설치가 필요없이 프로젝트 의존성만으로 관리할 수 있습니다.

-메모리에서 실행되기 때문에 애플리케이션을 재시작할때마다 초기화 된다는점을 이용하여 테스트용도로 많이 사용됩니다

domain패키지
======

domain -도메인이란것은 게시글 댓글 회원 정산 결제등에 소프트웨어에 대한 요구사항 혹은 문제 영역이라고 생각하면됩니다.
xml에 쿼리를 담고, 클래스에 쿼리의 결과를 담던 것들이 모두 도메인 클래스에서 해결된다.
위 사진 처럼 domain패키지를 springboot패키지안에 생성 posts패키지와 Posts클래스를 생성합니다.
![domain1](https://user-images.githubusercontent.com/100178951/178730979-0136d0e0-8ade-42bf-bb39-782b89bf2c34.jpg)



import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //1.
@NoArgsConstructor//2.
@Entity //3.    
public class Posts{

	@Id  //4.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//5.
    private Long id;

	@Column(length = 500, nullable = false) //6.
    private String title;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;

    private String author;

    @Builder    //7.
    public Posts(String title, String content, String author){
		this.title = title;
        this.content = content;
        this.author = author;
	}
}
해당코드를 작성

@실제 DB의 테이블과 매칭될 클래스. 주로 Entity 클래스라고 한다.


1.  @Getter
클래스 내 모든 필드의 Getter 메소드를 자동생성

2. @NoArgsConstructor
기본 생성자 자동 추가

public Posts() {}와 같은 효과

여기서 Post
=====

post라는 것은 어떨 때 발생하냐면, HTML에서 <Form> 태그를 사용한다든지, ajax에서 검색을 할 때(비동기화) 사용된다.
  
이러한 경우는 주로 검색 파라미터가 많은 경우이므로 멀티 파라미터로 받아야 한다. 
  
하지만 getMethod와 같이 SearchParam으로 받으면 안 되고 @RequestBody로 받겠다고 선언을 해줘야 한다. 
  
이는 http 통신을 할 때 post의 body에 data를 넣어서 보내겠다라는 의미로, RequestBody에 SearchParam 값들을 매칭시켜서 달라는 의미이다.
  
 3.@Entity
  
테이블과 링크될 클래스임을 나타낸다.
  
기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 매칭한다.
  
  ex) SalesManager.java -> sales_manager table
  
  4.@Id
  
해당 테이블의 PK
  
평균적으로 Entity의 PK는 Long타입 + Auto_increment로 사용
  
  5.GeneratedValue(strategy = GenerationType.IDENTITY)
	
PK의 생성 규칙이다.
	
Spring Boot 2.0에서는 GenerationType.IDENTITY 옵션을 추가해야 auto_increment가 된다.
	
6.Column(length = 500, nullable = false)
	
테이블의 컬럼을 나타낸다 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 컬럼
	
변경이 필요한 옵션이 있을 경우 사용한다. (ex> 문자열 사이즈 변경, 타입 변경 등에 사용됩니다)	
	
7.@Builder
	
해당 클래스의 빌더 패턴 클래스를 생성한다.
	
생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함한다.
	
	
	
서비스 초기 구축 단계에선 테이블(Entity 클래스) 설계가 빈번하게 변경되는데, 이때 롬복의 어노테이션이 코드 변경량을 최소화시켜준다.	
	

등록/수정/조회 API 만들기

API를 만들기 위해 총 3개의 클래스가 필요하다

Request 데이터를 받을 Dto
	
API 요청을 받을 Controller
	
트랜잭션, 도메인 기능 간의 순서를 보장하는 Service
	
Service는 트랜잭션, 도메인 간 순서 보장의 역할만 한다.
	
![image](https://user-images.githubusercontent.com/100178951/179711835-52a9dd6d-e1b9-43db-be9f-f70e5e7ad7e8.png)

Web Layer
> 흔히 사용하는 @Controller와 JSP/Freemarker 등의 뷰 템플릿 영역이다
	
> 필터(@Filter), 인터셉터, 컨트롤러 어드바이스(@ControllerAdvice)등 외부 요청과 응답에 대한 전반적인 영역을 이야기 한다.	

Service Layer
> @Service에 사용되는 서비스 영역이다.
	
> 일반적으로 Controller와 Dao의 중간 영역에서 사용된다
	
> @Transactional이 사용되어야 하는 영역이다	
	
	
	참고자료 https://unit-15.tistory.com/149
	
	https://velog.io/@g0709-19/Gradle-Could-not-find-method-compile-%ED%95%B4%EA%B2%B0-%EB%B0%A9%EB%B2%95
  
  참고서적 -> 스프링 부트와 AWS로 혼자 구현하는 웹 서비스  ->저자 이동욱님
