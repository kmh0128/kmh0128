import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){//세로 
            for(int j = 0; j < m; j++){//가로
                System.out.print("*");//별을 출력하면서 행과 열이 해당수만큼 반복
            }//처음에 세로와 가로를 반대로 입력해서 참고자료보고 수정
            System.out.println();
        }
    }
}

//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
//참고 자료 https://blog.naver.com/PostView.nhn?blogId=yongyos&logNo=221474336211