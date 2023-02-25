modelmapper
===

서로 다른 클래스의 값을 한 번에 복사하게 도와주는 라이브러리로,

어떤 Object (Source Object) 에 있는 필드 값들을 자동으로 원하는 Object (Destination Object) 에 매핑 시켜주는 라이브러리다.

ModelMapper 공식 문서

주로 DTO와 같은 클래스로 데이터를 받은 후 원하는 클래스(Entity)에 넣어줄 때, Getter/Setter를 이용해 필드를 복사/붙여넣기하는 작업을 거친다. 

이 때, 매핑해야할 필드가 다른 경우도 빈번하다. 즉, 다른 모델의 Object를 매핑해줘야하는 작업이 발생할 수 있다. 이런 단점들을 해결하기 위한 라이브러리이다.


pom.xml
===

의존성 추가

    <dependency>
			<groupId>org.modelmapper</groupId>
			<artifactId>modelmapper</artifactId>
			<version>3.1.0</version>
		</dependency>

스프링 Configulation에 bean으로 등록
====
    @Bean
	  public ModelMapper modelMapper() {
		  return new ModelMapper();
	  }

스프링에 의해 자동 생성된 객체를 생성자 주입으로 사용하기
====

참고 자료 https://zara49.tistory.com/153

https://velog.io/@drv98/%EB%AA%A8%EB%8D%B8-%EB%A7%A4%ED%8D%BCModelMapper-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0
