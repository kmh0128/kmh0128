import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);//전화번호부를 오름차순으로 정렬해준다.
        
        for(int i =0; i<phone_book.length-1; i++)//전화번호부 i번째부터 뒤에 전화번호부랑 비교해야되서 -1을 해줍니다.참고자료보기전엔 -1을 생각못해서 오류발생
        	if(phone_book[i+1].startsWith(phone_book[i]))//뒷번호가 앞번호랑 비교해 같은 번호로 시작하는지 검색
        		return false;//코드가 끝나지않으면 접두어가 없다는뜻이기 때문에 retrun true를 해줍니다.
        
        return answer;
    }
}
//참고자료 https://coding-grandpa.tistory.com/77
//문제 주소 https://programmers.co.kr/learn/courses/30/lessons/42577?language=java