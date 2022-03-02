import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();//해시맵을 설정
        
        for(String pl : participant)//key값을 value로 불러옵니다 이때 존재하지않으면 디폴트값을 얻습니다
        	map.put(pl,map.getOrDefault(pl, 0)+1 );//모든 참가자들에게 1을 플러스해서 1을가지게 해주고 동명이인의 경우 2가됩니다
        for(String pl : completion)//여기서 완주하지 못한 사람은 1을 가지기 때문에
        	map.put(pl, map.get(pl)-1);//participant와 구분하는 작업을 해줍니다
        
        for(String key : map.keySet()) {//key set으로 저장된 참가자들을 불러와줍니다
        	if(map.get(key)!=0) {//위에서 완주하지 못한사람은 1의값을 가지게됩니다
        		answer = key;
        		break;
        	}
        }
        return answer;
    }
}

//참고 자료:https://www.youtube.com/watch?v=_2yD46UxSso&t=951s
//문제 자료:https://programmers.co.kr/learn/courses/30/lessons/42576?language=java