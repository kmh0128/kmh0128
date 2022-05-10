import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> Hm = new HashMap<>();//해쉬맵을 구성
        
        for(int i = 0; i<clothes.length; i++) {
        	if(Hm.containsKey(clothes[i][1]))//해쉬맵에 있는 옷들을 한번씩 입엇을때마다 1로 표기
        		Hm.replace(clothes[i][1], Hm.get(clothes[i][1])+1);//한번 더 입었을경우 +1
        	else
        		Hm.put(clothes[i][1], 1);	//한번만 입었을경우
        }
        
        int answer = 1;//아무것도 안입었던경우를 초기값 1로설정
        for (int value : Hm.values()) {
            answer*=(value+1);//value 값을 해쉬값에 넣어주면서 더해준값에 곱해준다
        }
        answer-=1;//마지막에 아무것도 안입은 경우의수를 빼준다
        
        return answer; 
    }
}

//참고자료 https://developerdk.tistory.com/12

//문제 https://programmers.co.kr/learn/courses/30/lessons/42578?language=java

