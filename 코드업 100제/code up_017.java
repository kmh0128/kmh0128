import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%d %d %d", a, a, a);
    }
}


/*
코드업 문제 링크 : https://codeup.kr/problem.php?id=1017

1. 문제 설명

int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.

참고

printf("%d %d %d", a, a, a);
와 같은 방법으로 출력할 수 있다.

2. 입력

정수 1개가 입력된다.

3. 출력

입력받은 정수를 공백으로 구분해 3번 출력한다.

4. 입력 예시

125

 
5. 출력 예시

125 125 125

*/
