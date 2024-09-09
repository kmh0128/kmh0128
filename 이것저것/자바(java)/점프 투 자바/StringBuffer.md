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







참고자료
---

점프 투 자바 저자 박응용님
