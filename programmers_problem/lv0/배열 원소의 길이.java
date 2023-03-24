class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];//int타입의 배열을 초기화 그리고 strlist의 길이만큼 변수의 크기를 지정해준다

        for (int i = 0; i < answer.length; i++) {//배열의 길이만큼 반복
            answer[i] = strlist[i].length();//strlist[i].length()를  strlist의 i의 위치에있는 값의 길이를 answer에 대입합니다.
        }
        return answer;
    }
}

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/120854
