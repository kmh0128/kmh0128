import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;//최소값을 저장할 int형 선언
        Arrays.sort(people);//내림차순 정렬
        
        for(int max = people.length-1; min <= max; max--) {
        	if(people[min] + people[max] > limit) {
        		answer++;//for 반복문으로 가장 무거운 사람을 뒤에 놓고 인덱스의 길이는 0부터 시작이므로 -1을 해주고 최소값 최대값이 보트무게보다 더나가면 보트를 추가
        	}else {
        		answer++;//아니면 동시에 최소인원도 태워주고 보트를 증가
        		min++;
        	}
        }
        return answer;
    }
}

//참고 자료 https://conanglog.tistory.com/227
//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/42885?language=java