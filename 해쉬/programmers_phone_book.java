import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> h = new HashMap<>();//HashMap을 설정
        for(int i = 0; i<phone_book.length; i++) {//phone_book의 길이만큼 반복
        	h.put(phone_book[i], 1);//Phone_book을 해쉬맵에 넣어주면서 value값 1ㅗ 서정
        }
    	
        for(int i=0; i<phone_book.length; i++) {//인덱스를 0부터 반복
        	for(int j=1; j<phone_book[i].length(); j++)//j번째는 1부터 반복 시작
        		if(h.containsKey(phone_book[i].substring(0, j)))//i번째 인덱스가 0부터 j까지 시작해서 포함되어있는지 확인
        			return false;//접두어가 존재하면 return false 존재하지않으면 return true가된다
        }
        
        return true;
    }
}

//참고자료 https://coding-grandpa.tistory.com/77
//문제 https://programmers.co.kr/learn/courses/30/lessons/42577?language=java