class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (n * 12000) + (k * 2000) - ( (n / 10) * 2000);
        return answer;
    }
}
//n이 10일때 음료수 한번 k 1번이 공짜니깐 n을 십으로 나눠주고 2천을 곱해서 빼주면 그대로 값이 나온다.




//다른 사람 풀이

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a = n / 10;

        if (n / 10 == a){
            answer = (n * 12000) + (k * 2000) - (a * 2000);
        } else {
            answer = (n * 12000) + (k * 2000); 
        }
        return answer;
    }
}

//다 풀면 볼수 있는데 예외처리까지 깔끔해서 참고했다.


//문제 사이트 및 참고:https://school.programmers.co.kr/learn/courses/30/lessons/120830
//다풀면 다른분들 풀이도 참고할수 있다.
