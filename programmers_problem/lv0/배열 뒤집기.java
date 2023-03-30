class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];        // int타입 배열 선언
        for(int i=0; i<num_list.length; i++) {          //매개변수로 들어온 배열크기만큼 for문을 선언해준단
            answer[i]=num_list[num_list.length-i-1];    //리턴용 배열의i번째에 매개변수배열의 크기-i-1번째 정수를 넣고 역순이 되게 해준다
        }
        return answer;
    }
}

//문제 출처:https://school.programmers.co.kr/learn/courses/30/lessons/120821
