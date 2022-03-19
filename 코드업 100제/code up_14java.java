package hundered;

import java.util.Scanner;

public class cdu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char a = sc.next().charAt(0);
    char b = sc.next().charAt(0);

    System.out.println(b + " " + a);//입력받은 두개의 문자를 순서를 바꿔서 출력
    sc.close();
  }
}

//코드업 문제 https://codeup.kr/problem.php?id=1014