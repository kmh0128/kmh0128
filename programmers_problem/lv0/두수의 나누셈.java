class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1/num2*1000; // 이번문제는 소수점자리까지 계산후 1000을 곱하는거니 double형
        return (int)answer;
    }
}

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/120806
