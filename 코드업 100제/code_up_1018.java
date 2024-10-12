import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시간을 입력 받는다.
        String time = scanner.nextLine();

        // 입력받은 시간을 그대로 출력
        System.out.println(time);

        scanner.close();
    }
}
