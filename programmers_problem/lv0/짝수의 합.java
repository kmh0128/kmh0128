class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) //0으로 나누어 떨어지면 짝수
            answer += i;
        }
        return answer;
    }
}

//문제 사이트:https://school.programmers.co.kr/learn/courses/30/lessons/120831
