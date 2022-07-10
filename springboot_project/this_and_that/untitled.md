@SpringBootApplication 어노테이션 : SpringBootConfiguration, ComponentScan, EnableAutoConfiguration 3가지 기능이 하나로 합쳐저 있다.


1.@SpringBootConfiguration : 컨피그레이션 설정

뒤의 두개는 빈을 등록하는 설정이다.


2.@ComponentScan : 내부 스캔

Configuration, Repository, Service, Controller, RestController

Component라는 어노테이션이 달린 의존성이 스캔된다.

3.@EnableAutoConfiguration : 외부 스캔

만약에 ComponentScan 스캔을 하고 EnableAutoConfiguration을 할때 둘의 내용이 겹치는 것이 있다면 뒤의 내용으로 덮어써진다.
factories 밑에 있는 의존성이 스캔됨
com 밑의 패키지에서 다른 구성 요소, 서비스를 찾도록 스캔한다.

참고자료:https://velog.io/@borab/Spring-boot-%EA%B0%9C%EB%85%90-%EC%A0%95%EB%A6%AC-1
