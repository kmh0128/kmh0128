maven과 gradle 빌드 관리도구의 차이점
===
그냥 최근 스프링부트 프로젝트 공부하다가 궁금해져서 찾아보는중에

일단 maven이란?
==

Maven이란?

아파치 메이븐은 자바용 프로젝트 관리 도구이다.

아파치 Ant의 대안으로 만들어졌다.

아파치 라이센스로 배포되는 오픈 소스 소프트웨어이다.

프로젝트를 진행하면서 사용하는 수많은 라이브러리들을 관리해주는 도구입니다.

여기서 메이븐의 특징적인 점은 그 라이브러리들과 연관된 라이브러리들까지 거미줄처럼 모두 연동이 되서 관리가 된다는 점입니다.

즉, 메이븐은 네트워크를 통해 연관된 라이브러리까지 같이 업데이트를 해주기 때문에  사용이 편리합니다.

 

POM - Project Object Model
Maven의 기능을 이용하기 위해 POM이 사용됩니다.

POM은 약자 이름 그대로 Project Object Model의 정보를 담고 있는 파일입니다.

pom.xml에서 주요하게 다루는 기능들은 아래와 같습니다.

프로젝트 정보 : 프로젝트의 이름, 라이센스 등

빌드 설정 : 소스, 리소스, 라이프사이클별 실행한 플로그인 등 빌드와 관련된 설정

빌드 환경 : 사용자 환경 별로 달라질 수 있는 프로파일 정보

pom 연관 정보 : 의존 프로젝트(모듈), 상위 프로젝트, 포함하고 있는 하위 모듈 등

Ant
==

위에서 maven이 Ant의 대안으로 만들어졌다 해서 궁금해서 검색해본 결과

Ant란?

설정을 위해 xml을 사용합니다.

간단하고 사용하기 쉽다고 합니다.

단점
==
복잡한 처리를 하려하면 빌드 스크립트가 장황해져 관리가 어렵습니다.

외부 라이브러리를 관리하는 구조가 없다.


참고자료:https://dev-coco.tistory.com/65

https://qazyj.tistory.com/316
