class Solution {
    public static int[] solution(int[] answers) {
        int[] answer;
        
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];//���� ������ ���� �迭�� ���� ����
                                       //score[0],score[1],score[2] a b c �迭�� ���� ���������� �ִ´�
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5])  score[0]++; 
            if(answers[i] == b[i%8])  score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }
        
      //���� ���� ������ ���� �ϰ� ���� ��������� �ݺ�
        int max = 0;
        for(int i=0; i<3; i++){
            if(score[i] > max){ max = score[i]; }
        }
        
      //���� ���� ������ �¾Ҵ��� ����� �ִ����� �˻����ش�
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
//�����ڷ� https://jeleedev.tistory.com/30
//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/42840?language=java