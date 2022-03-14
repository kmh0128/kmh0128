class Solution {
    public static int[] solution(int[] answers) {
        int[] answer;
        
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];//맞은 개수를 선언 배열을 따로 선언
                                       //score[0],score[1],score[2] a b c 배열을 비교해 맞힌개수를 넣는다
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5])  score[0]++; 
            if(answers[i] == b[i%8])  score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }
        
      //가장 높은 점수를 설정 하고 기존 답안지에서 반복
        int max = 0;
        for(int i=0; i<3; i++){
            if(score[i] > max){ max = score[i]; }
        }
        
      //가장 높은 점수를 맞았는지 몇명이 있는지를 검사해준다
        int maxCount = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max){ maxCount++; } 
        }

        answer = new int[maxCount];
        int idx = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) answer[idx++] = i+1;
        }
        return answer;
    }
}
//참고자료 https://jeleedev.tistory.com/30
//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/42840?language=java