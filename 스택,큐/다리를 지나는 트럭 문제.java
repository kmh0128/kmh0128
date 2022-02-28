import java.util*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	Queue<Integer> queue = new LinkedList<>();
    	int answer = 0; //무게의 합
    	int time = 0; //시간
    	
    	for(int i = 0; i<truck_weights.length; i++) {
    		int truck = truck_weights[i];
    		
    		while(true) {
    			if(queue.isEmpty()) {//다리가 비어있는경우를 설정
    				queue.add();
    				answer+=truck;
    				time++;
    				break;
    			}else if(queue.size()==bridge_length) {//다리의 길이가 꽉찬경우
    				answer-=queue.poll();
    			}else {//다리의 무게가 남아있는 경우
    				if(answer + truck <= weight) {
    					queue.add(truck);
    					answer+=truck;
    					time++;
    					break;
    				}else {//초과햇을 경우
    					queue.add(0);
    					time++;
    				}	
    			}
    		}
    	}
    	
    	return time + bridge_length;//마지막 트럭이 올라와도 건너가는 시간을 설정
    }
}
//참고자료:https://minhamina.tistory.com/241
//문제 :https://programmers.co.kr/learn/courses/30/lessons/42583?language=java