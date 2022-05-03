import java.util.*;
import java.io.*;

public class Main {
	 
	static long[] arr;//long 타입 배열을 선언 이때 int타입으로는 다 받아낼수가 없어서 long타입선언
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력
		
		int N = Integer.parseInt(br.readLine());//정수형으로 변환
		
		arr = new long[N + 1];// -1로 초기값을 잡기때문에 인덱스를 +1해준다
 
		for(int i = 0; i < N + 1; i++) {
			arr[i] = -1;
		}
        
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(Fib(N));
	}
	
	public static long Fib(int N) {
		if(arr[N] == -1) {//피보나치 수열 초기값 -1과 피보나치수열 선언
			arr[N] = Fib(N - 1) + Fib(N - 2);
		}
		return arr[N];
	}
 
}

}
//백준 문제 https://www.acmicpc.net/problem/2748
//참고 자료 https://st-lab.tistory.com/123