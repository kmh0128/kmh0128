class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] > height)
                answer++;
        }
        return answer;
    }
}

//문제 :https://school.programmers.co.kr/learn/courses/30/lessons/120585
