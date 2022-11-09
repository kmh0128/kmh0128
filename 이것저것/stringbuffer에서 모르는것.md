알고리즘 문제 풀어보다가 문자열 입력

StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.

StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성

이것이 기본이지만 궁금했던것은 알고리즘 문제에서 StiringBuffer.reverse()사용에 관해서 입니다.

    public class Program {
	    public static void main(String[] args){
		    StringBuffer sb = new StringBuffer("01234567890");
		
		    sb.reverse();
		    System.out.println(sb);
      }
    }

결과는

09876543210 로 출력

참고자료: https://wikidocs.net/276

