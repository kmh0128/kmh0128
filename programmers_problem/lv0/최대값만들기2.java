import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);//배열을 오름차순으로 정렬을 해준다
        return numbers[numbers.length-2]*numbers[numbers.length-1];//배열의 마지막 숫자와 그전 숫자를 곱해준다 -1 -2 는 인덱스가 0번자리부터 시작하기 때문
    }
}

//프로그래머스 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120847

