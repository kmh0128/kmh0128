class Solution {
    public int solution(int n, int t) {
        
        for(int i = 1; i<=t; i++){//int i = 1은 1시간부터임을 체크 t만큼 반복하면 1시간이 지날때마다 2배를 곱하게 반복문을 설정
            n *= 2; //시간이 흐를때마다 2배수
        }
        return n;
    }
}

//문제출처: https://school.programmers.co.kr/learn/courses/30/lessons/120910

/*
문제설명

어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 

처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
*/

/*
제한사항

1 ≤ n ≤ 10

1 ≤ t ≤ 15
*/

/*
입출력 예

n	 t	 result
2	 10	 2048
7	 15	 229,376

*/
