1 -> 개요
===

스프링부트 프로젝트를 설정하다보면 application.properties 또는 application.yml 혹은 둘 다 보이거나 할때가 있는데,

이 둘은 외부 속성을 설정하는 파일이다. 

그럼 둘의 차이점은 무엇일까?

application.properties
===

예)

spring.datasource.url=jdbc:h2:DB이름
spring.datasource.username=username
spring.datasource.password=1234


application.yml
===

예)

spring:
    datasource:
        url: jdbc:h2:DB이름
        username: username
		password: 1234
    
//application.yml이 계층적으로 잘 표현할 수 있어 편리하다.    

차이점
===

application.properties
===

Spring boot 애플리케이션 프로젝트에서 resource 디렉토리 하위에 자동으로 생성되는 파일이다.

.properties 파일의 포맷은 name=value 형식이다.


application.yml
====
properties 파일과 달리 계층 구조 형식으로 값을 지정할 수 있고, prefix의 중복 제거가 가능하다.

.yml 파일을 사용하기 위해서는 SnakeYAML 라이브러리가 포함되어야 하고, 

일반적으로 spring-boot-starter의 의존성은 기본적으로 제공해준다.

참고자료: https://sowon-dev.github.io/2021/08/17/210818Spring-applicationyml/

https://sillutt.tistory.com/entry/IntelliJ-applicationproperties-%EA%B3%BC-applicationyml%EC%9D%98-%EC%B0%A8%EC%9D%B4
