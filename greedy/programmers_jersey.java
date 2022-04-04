import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;//도둑 맞지않은 사람을 구해준다
        
        Arrays.sort(reserve);//여벌을 가지고 있는 사람을 오름차순 배열
        Arrays.sort(lost);//잃어버린사람을 오름차순 배열
        
        for(int i = 0; i<lost.length; i++;) {//잃어버린 사람만큼 길이를 반복
        	for(int j = 0; j<reserve.length; j++;) {//여별을 가지고있는사람만큼 반복
        		if(reserve[j]=lost[i]) {//여벌을 가지고 있는 사람이 도둑맞은 경우
        			answer++;
            		reserve[j] = -1;//둘다 -1로 설정해줘서 여벌을 가지고 있는사람도 잃어버린 사람으로 고쳐준다
            		lost[i] = -1;
            		break;
        		}
        	}
        }
        
        for(int i = 0; i<lost.length; i++;) {
        	for(int j = 0; j<reserve.length; j++;) {
        		if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){//여벌을 가지고 있는사람이 도둑맞지 않았다면 앞뒤 사람이 잃어버렸는지 확인
                    answer++;
                    reserve[j] = -1; //암뒤 사람에게 빌려주었으므로 -1로 설정
                    break; 
                }
        	}
        }
        return answer;
    }
}
//참고 자료 https://jeleedev.tistory.com/32
//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
