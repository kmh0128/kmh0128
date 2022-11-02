class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n <= 7){ //7조각보다 작으면 한조각이 남는다
            answer = 1;
        }else if (n % 7 == 0){//7로 나누어떨어지는 경우
            answer = n / 7 ;
        } else {
            answer = n / 7 + 1;//그이엔 +1을 예외
        }
        return answer;
    }
}

//다른사람 풀이

class Solution {
    public int solution(int n) {
        int answer = 0;

        answer = (int) (Math.floor(n - 1) / 7) + 1;

        return answer;
    }
}


//깔끔하게 코드되있어서 참고해봤다

//문제 참조 및 문제 사이트 : https://school.programmers.co.kr/learn/courses/30/lessons/120814
