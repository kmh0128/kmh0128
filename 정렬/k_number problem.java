import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];//answer은 크기가 커맨드랑 동일 커맨드 길이만큼 돌려주고 배열형으로 변환
        for(int i=0;i<commands.length;i++){
            int x,y,z;
            x=commands[i][0];//문제에서 i는 x로 지정해서 
            y=commands[i][1];//j는 y로 받는다
            z=commands[i][2];//k는 z로 받는다
            int[] temp = Arrays.copyOfRange(array,x-1,y);//참고자료에서 copyOfRange 메소드 활용법을 참고해서 범위를 설정
            Arrays.sort(temp);//temp에 옮긴 수들을 오름차순 정렬
            answer[i]=temp[z-1];
        }
        return answer;
    }
}
//프로그래머스문제 https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
//참고자료 https://kkmdailylog.tistory.com/entry/AlgorithmJAVA%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4K%EB%B2%88%EC%A7%B8-%EC%88%98