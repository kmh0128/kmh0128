import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> squeue = new PriorityQueue<>();
        for(int i = 0; i<scoville.length; i++)//큐를 만들고 스코빌 전체를 돈다
        	squeue.offer(scoville[i]);//큐에 스코빌을 더해준다
        
        while(squeue.peek()<K) {
        	if(squeue.size()==1) {//이부분을 처음에 2라고 잘못 설정하고 참고자료를 통해  참고
        		return -1;
        	}
        		int first = squeue.poll();//맨앞의걸 가져오고 삭제
        		int second = squeue.poll();//두번째작은것을 가져오고 삭제?
        		
        		squeue.offer(first + second*2);//계산후 큐의 새로운 자리에 추가 
        		answer++;//추가
        		}
        
        return answer;
    }
}

//참고자료: https://dunchi.tistory.com/83
//프로그래머스 문제:https://programmers.co.kr/learn/courses/30/lessons/42626?language=java