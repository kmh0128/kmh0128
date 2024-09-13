StringBuffer
===

StringBuffer 는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다

StringBuffer 자료형은 append 메서드를 사용하여 문자열을 계속해서 추가해 나갈 수 있다. 

그리고 toString() 메서드를 사용하면 StringBuffer 를 String 자료형으로 변경할 수도 있다

예시
---

    StringBuffer sb = new StringBuffer(); // StringBuffer 객 체 sb 생 성
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");
    String result = sb.toString();//String 자료형으로 변경
    System.out.println(result); // "hello jump to java" 출 력

위의 결과값은

    hello jump to java

로 출력된다

이 예제를 StringBuffer 대신 String 자료형을 사용하도록 변경해보자

String문 출력
---

    String result = "";
    result += "hello";
    result += " ";
    result += "jump to java";
    System.out.println(result);  // "hello jump to java" 출력

출력결과
---

    hello jump to java

두 번째 예제와 첫 번째 예제의 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다르다. 

첫 번째 예제에서는 StringBuffer 객체를 한 번만 생성하지만, 

두 번째 예제에서는 String 자료형에 + 연산이 있을 때마다 새로운 String 객체를 생성하므로 총 4개의 String 자료형 객체가 만들어진다.







참고자료
---

점프 투 자바 저자 박응용님
