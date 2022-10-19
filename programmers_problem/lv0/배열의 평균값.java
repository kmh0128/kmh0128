class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for (int loop : numbers) {
            sum += loop;
        }
        double answer = (double) sum / numbers.length;
        return answer;
    }
}


/*
for문 =>for(반복 대상 변수명: 반복 대상){
          수행문
          }
sum(합계) 값은 int(정수형)이므로 double(더블형)으로 변환을 해줘야한다.
*/

//참고 => https://school.programmers.co.kr/learn/courses/30/lessons/120817
