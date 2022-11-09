import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}




//문제 요점: reverse() 메소드는 StringBuffer 객체를 리턴하기 때문에, toString() 메소드를 사용하여 String(문자열)으로 변환해야 합니다.
// toString() 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드입니다.

//참고 밑 문제주소:https://school.programmers.co.kr/questions/38034


//string.reverse()에 관해서 참고가 되었다.
