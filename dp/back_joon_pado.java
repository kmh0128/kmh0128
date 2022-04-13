import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		long T[] = new long[101]; //int형으로 계산 진행하면 수가 더 커져서 연산오류가 일어나서 더 큰수를 받아들일수있는 long타입으로 변환
		
		T[1] = 1;//1번인덱스부터 5번 인덱스 숫자까지 설정
		T[2] = 1;
		T[3] = 1;
		T[4] = 2;
		T[5] = 2;
		
		for(int i = 6; i<=100; i++) {//6부터 100까지 피보나치 수열로 계산
			T[i] = T[i-1] + T[i-5];
		}
		for(int i = 0; i<A; i++) {
			int N = sc.nextInt();
			System.out.println(T[N]);
		}
	}
}

//참고 자료 https://cocoon1787.tistory.com/675