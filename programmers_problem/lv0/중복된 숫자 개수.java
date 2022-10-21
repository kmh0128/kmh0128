class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int a = 0;  a<array.length; a++){ //a를 반복문 돌려서 배열길이만큼 반복 그리고 배열a의 숫자가 n과 같으면 하나씩 카운트
            if(array[a] == n){
                answer++;
            }
        }
        return answer;
    }
}

//문제 자료:https://school.programmers.co.kr/learn/courses/30/lessons/120583
