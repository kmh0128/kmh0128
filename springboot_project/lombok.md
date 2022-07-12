lombok에 대하여
=======

자바 개발자들의 필수 라이브러리(lombok)

자바개발을 하는 경우 자주 사용하는 코드 Getter,Setter,기본생성자 tostring등을 어노테이션으로 자동 생성해줍니다.

>롬북을 설치할려면 build.gradle 파일로가서 dependencies항목에서 다음과 같은 코드를 추가

 dependencies {
 
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    
}

윈도우에서는 ctrl + shift +A버튼를 눌러서 plugin 실행후 lombok을 검색하여 인스톨해준다.

Lombok 장점
어노테이션 기반의 코드 자동생성을 통한 생산성 향상 반복코드 다이어트를 통해 가독성 및 유지보수성 향상 Getter/Setter 외 빌더 패턴이나 로그생성 등 다양한 방면으로 활용 가능

Lombok 단점 및 주의사항
롬복 라이브러리는 개발자마다 호불호가 나뉠 수 있다. 일부 개발자들은 코드가 직접 눈에 보이는 직관성을 유지하는 것이 좋다고 보는 의견도 있는 만큼 자신의 프로젝트나 성향에 따라 사용하면 좋을 것이다. 또한 API설명과 내부동작을 어느정도 숙지하고 사용해야 한다. 예를 들어 롬복의 @Data 어노테이션이나 @toString 어노케이션으로 자동 생성되는 toString()메서드는 순환 참조 또는 무한재귀호출 문제로 인해 StackOverflowError가 발생할 수도 있다.
 물론 이 문제를 인지한 롬복에서 해결할 수 있는 속성을 제공하지만 롬복이 편리하다는 이유만으로 마구 사용한다면 여러가지 예외문제가 발생할 수 있음을 인지해야 한다. 


참고서적 및 자료 https://cheershennah.tistory.com/183 

스프링부트와 AWS로 혼자 구현하는 웹서비스 ->저자 이동욱
