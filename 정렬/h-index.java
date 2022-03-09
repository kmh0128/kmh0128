import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);//오름차순으로 정렬
        
        for(int i=0; i<citations.length; i++) {//citiation의 길이만큼 반복
        	int h = citiations.length-i;//citation길이 5에서 i만큼 빼준다 처음에 i를 빼주지않아 틀렸다 참고자료보고 참고
        	
        	if(citiations[i]>=h){//조건문의 조건에 들어맞으면 answer에 저장 조건에 들어맞지않음 브레이크
        		answer=h;
        		break;
        	}
        }
        return answer;
    }
}
//참고자료 https://conanglog.tistory.com/221
//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/42747?language=java