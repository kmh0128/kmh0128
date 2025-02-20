
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;//인원수 나누기 조각수가 0이 떨어져야 한사람당 하나의 피자조각이 분배가 되기때문에 0으로 초기값 설정
        if(n%slice == 0)
        {
            answer = n/slice;// 인원수하고 조각수를 나누어서 0이 되면통과, 부족하지않게 먹을 최소의 수
        }
        else {
            answer = n/slice + 1;// 인원수하고 조각수를 나누어서 0이 되지 않는 결과 피자를 1판 더 추가
        }

        return answer;
    }
}

/*
문제 설명

머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 

피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

제한사항

2 ≤ slice ≤ 10

1 ≤ n ≤ 100

입출력 예
\slice\	n\	result\
\7\	10\	2\
\4\	12\	3\

문제 출처
https://school.programmers.co.kr/learn/courses/30/lessons/120816?language=java
*/
