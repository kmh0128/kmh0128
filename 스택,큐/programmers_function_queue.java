import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    	Queue<Integer> q = new LinkedList<>();//순번대로 진행하기위해 큐를작성
        ArrayList<Integer> result = new ArrayList<>();//결과값을 담기위한 리스트 선언
        for (int i = 0; i < progresses.length; i++) {//반복문 선언
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);//작업에 필요한 날짜를 작업별로 계산
            q.offer(day);//앞에서부터 큐에 넣어준다
        }
        int prev = q.poll();//맨앞의 큐를 꺼내주고 삭제
        int cnt = 1;//초기값 1로 선언 작업 1일차니깐 카운트를 1
        while (!q.isEmpty()) {//큐가 비지않는한 계속 반복
            int next = q.poll();//또 앞에 큐를 가져오고 삭제
            if (prev >= next) {//맨앞의 값이 크거나 같으면
                cnt++;//카운트해준다
            } else {
                result.add(cnt);//결과값에 카운트한 시간을 더해주고
                cnt = 1;//초기값을 1로 다시 설정
                prev = next;//이것은 이전값 다음값의 같을때
            }
        }
        result.add(cnt);//결과 리스트에 카운트한 값을 넣어주고

        int[] answer = new int[result.size()];//결과가만큼 answer배열 선언
        for (int i = 0; i < answer.length; i++) {//길이만큼 반복문 선언
            answer[i] = result.get(i);//배열에 결과값을 가져온다
        }

        return answer;
    }
}

//참고자료 https://asong-study-record.tistory.com/82
//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/42586?language=java