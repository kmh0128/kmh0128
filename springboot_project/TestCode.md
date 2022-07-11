TestCode란?
=======

Test Code란
프로덕션 코드가 정상적으로 동작하는지 확인하는 코드를 의미합니다.

테스트 코드는 현재 웹 서비스에서 매우 중요한 요소입니다. 

테스트 코드에서 꼭 짚고 넘어가야 하는것은 TDD와 단위테스트(unit test)입니다.

TDD
테스트가 주도하는 개발(Test-Driven-Development, 혹은 Test-First-Development) 을 의미합니다.

![img](https://user-images.githubusercontent.com/100178951/178267847-6d16690d-4dcc-449b-9063-6cfd9e273283.gif)

1.항상 실패하는 테스트를 먼저 작성한다(RED)
2.테스트가 통과하는 프로덕션 코드를 작성하고(Green)
3.테스트가 통과하면 프로덕션 코드를 리팩토링합니다.(Refacetor)

Production Code(프로덕션 코드)
프로그램 구현을 담당하는 부분으로 사용자가 실제로 사용하는 소스 코드를 의미합니다.

단위 테스트
====

TDD단위 테스트 첫번째 단계인 기능 단위의 테스트 코드를 작성을 얘기합니다. 
순수하게 테스트 코드만 작성하는 것을 얘기합니다.

테스트 코드를 작성할 때 이점은 무엇일까요? 불확실성을 많이 제거 해준다, 

나중에 개발자가 코드를 리팩토링 하거나 라이브러리를 업그레이드 등에 기존 기능이 올바르게 작동하는지를 확인할 수 있습니다.(예, 회귀 테스트) 등 여러가지가 있지만 가장 크게 공감할 수 있는건 톰캣을 띄워서 System.out.println 등으로 확인할 시간을 줄여준다. 는 측면이 있습니다. 

톰캣을 띄우면 크게 몇 분 이상이 소요됩니다. 만약 테스트가 개발자가 원하는대로 나오지 않으면 다시 톰캣을 재시작해야 합니다. 이 과정을 계속하면 크게 몇 시간이 소비되기도 합니다.

또한 자동검증 이 되게 합니다. 작성된 단위테스트를 실행만 하면 더는 수동검증은 필요가 없습니다.

마지막으로, 개발자가 만든 기능을 안전하게 보호 해줍니다. 코드를 작성하다보면 여러 코드들이 상호간 영향을 주고 받게 됩니다. 이 과정에서 A 코드를 수정했을 때 B 코드에 영향을 줘 B 코드에 대한 테스트 케이스가 실패해 기존 코드에 영향이 없도록 수정해 줄 수있습니다.

언어별로 테스트 코드 여러 테스트코드 프레임워크가 있습니다. 가장 대중적인 테스트 프레임워크로는 xUnit 이 있습니다.

개발환경(x) 에 따라 Unit. 테스트를 도와주는 도구라고 생각하면 됩니다.

Java - JUnit
DB - DBUnit
.net - Unit
 
톰캣(Tomcat)- 아파치 소프트웨어 재단에서 개발하는 Java 기반의 서블릿 컨테이너이자 웹 서버. JSP/Spring으로 웹사이트를 구축한다면 톰캣은 거의 반드시 사용된다고 볼 수 있다. 
Tomcat은 수컷 고양이를 뜻하는 영어 단어이다.

Test 코드 및 Controller 코드
======

Controller 코드
![test1](https://user-images.githubusercontent.com/100178951/178311137-e3aa1376-dd5f-4c41-ace8-008aa55b11cf.jpg)

@SpringBootApplication의 기능은
스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정됩니다.

@SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트의 최상단에 위치 해야합니다.

main 메소드에서 실행하는 SpringApplication.run 으로 인해 내장 WAS(Web Application Server) 를 실행합니다.

내장 WAS란 별도의 외부에 WAS 를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것을 의미합니다.

스프링 부트에선 내장 WAS 사용을 권장합니다.

언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때문입니다.

Test 코드
====
![Test2](https://user-images.githubusercontent.com/100178951/178311689-7aead787-1edd-4e0a-a0f7-adf10f4329e2.jpg)


테스트 코드는 대상 클래스 이름에 Test를 붙인다. ex) HelloControllerTest

@RunWith(SpringRunner.class)

()안에 있는 스프링 실행자를 사용하겠다는 의미. -> 스프링부트 테스트와 JUnit 사이에 연결자 역할을 한다.

자신은 스프링부트가 최신버전이어서 2.7.1버전이어서 2.1.7과 같이 해당 버전에서는 오류가 발생했는데 이때 Alt+Enter를 누르면 문제에 대한 수정 제안 목록이 표시

되고 해결되었습니다
 
@WebMvcTest

Web에서 테스트하기 힘든 컨트롤러를 테스트 해준다. Web(MVC)에 집중할 수 있는 어노테이션으로 @Controller, @ControllerAdvice등을 사용할 수 있다.

 

@Autowired

스프링이 관리하는 빈(Bean)을 주입 받는다.

 

MockMvc

웹 어플리케이션을 서버에 배포하지 않고도 스프링 MVC의 동작을 재현할 수 있는 클래스이다.

 

private MockMvc mvc

이 클래스(객체)를 통해 웹 API를 테스트할 수 있다.(HTTP, GET, POST 등)

테스트코드를 실행하였을때 (Shift + + control + r)과 같이 Tests passed가 나오면 테스트가 무사히 통과된것입니다.

![다운로드 (2)](https://user-images.githubusercontent.com/100178951/178312153-24999afe-3c17-443f-8bf3-aef1d879ee30.png)

테스트코드가 통과안되는 오류에서는 Intellij 설정 ->build, excution,deployment ->build tool -> gradle -> board항목에서  Gradle항목을 ->Intellij 바꿔주면서 

해결 되었습니다.(찾아보니 빌드할 때 JUnit으로 테스트가 진행 되어야 하는데 Gradle로 되어서 발생하는것 같다.)

여기서 JUnit은 자바에서 테스트 코드 작성을 도와주는 프레임워크입니다.


참조서적 및 자료 

Spring Boot와 AWS 로 혼자 구현하는 웹서비스 -> 저자 이동욱님

참조 자료 https://algopoolja.tistory.com/98
