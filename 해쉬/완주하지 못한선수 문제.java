import java.util.Arrays;//자바 유틸 라이브러리에서 배열을 입력받습니다.

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);//인덱스를 입력받습니다.
        Arrays.sort(completion);//두가지 부분이 다른부분이 있는지 확인합니다.
		
        
        int i=0;
        for(i=0; i<completion.length; i++)//자신은 여기서 처음에 더 큰 인덱스로 접근해서 에러가 발생했는데 참고자료에 의해 더 짧은 인덱스로 접근해야되는것을 참고하였습니다.
	}
            if(!participant[i].equals(completion[i]))
                break;
        
        return participant[i];/여기서는 위에서 안걸러졌을 경우 참가자중 마지막 참가자가 완주하지 못한선수입니다
		//여기서도 자신은 위에 반복문에서 다 걸러지는줄 잘못 입력받았고 참고 자료를 이용해 참고하였습니다.
    }
}
//참고 자료:https://www.youtube.com/watch?v=_2yD46UxSso&t=951s
//문제 자료:https://programmers.co.kr/learn/courses/30/lessons/42576?language=java