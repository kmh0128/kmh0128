Logic(로직)
===

프로젝트나 어플리케이션은 보통 아래의 논리적흐름의 예시를 따릅니다.

예1

   1. 데이터를 입력받는 기능

   2. 데이터를 저장하는 기능  

   3. 학기별 학점과 남은 학점을 계산하는 기능 

   4. 데이터를 차트로 보여주는 기능 

비즈니스의 로직의 예는 1,3번이다.
2,4는 일반적 로직 아래그림 참고

예2

 - 프로그램에서 실세계의 규칙에 따라 데이터를 생성, 표시, 저장, 변경 (CRUD) 부분을 의미한다.

 - 어플리케이션이 제공하고자 하는 서비스나 업무를 직접적으로 구현하는 로직

 - 업무에 필요한 데이터 처리를 수행하는 응용프로그램의 일부 

 - 대부분 클라이언트 프로그램은 사용자 인터페이스와 비즈니스 로직으로 구성 되며, 서버 프로그램은 대부분 비즈니스 로직으로 구성된다.

![8AEC8494EDB88BEC848EEDB8A7ECB4AFEC80_key_2](https://github.com/kmh0128/kmh0128/assets/100178951/6e77eee1-1de3-438f-9aa8-289c1e4f6d5b)

일반로직
===
대부분 일반적인 기능을 다루고 있고, 범용으로 사용할 수 있는 특성을 가지기 때문에 관련 솔루션이나 라이브러리가 다양하게 개발되어 있는 경우가 많습니다.

2번 기능을 위해 데이터베이스가 개발되어 있고, 4번 기능을 위해서는 차트 라이브러리가 개발되어 있는 것이 좋은 예입니다.

비즈니스 로직
===
반면 비즈니스 로직은 해당 서비스에 특화되어 있기 때문에 다른 서비스에서는 사용하기 어렵습니다.

개발자보다 현업의 실무 담당자가 훨씬 더 잘 이해하고 있다는 것도 또다른 특징

전적으로 개발자의 영역이기보다는 개발자와 업무 담당자가 절반씩을 차지하는 영역이라고 할 수 있습니다.


참고자료:https://m.blog.naver.com/PostView.nhn?blogId=sqlpro&logNo=220875456425&proxyReferer=https:%2F%2Fwww.google.com%2F

https://0812.tistory.com/10

