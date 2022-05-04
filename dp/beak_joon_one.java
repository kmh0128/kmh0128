import java.io.*;

public class Main {
	static Integer[] dp; //메모제이션할 배열 선언

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력을 받는다
		
		int N = Integer.parseInt(br.readLine());//int형으로 변환
		
		dp = new Integer[N + 1];//인덱스를 하나 증가
		dp[0] = dp[1] = 0;
		
		System.out.print(recur(N));
		 
	}
 
	static int recur(int N) {//재귀함수 선언
 
		if (dp[N] == null) {
			// 6으로 나눠지는 경우 
			if (N % 6 == 0) {//1을 빼는경우 3을 나눈 경우 2를 나눈경우
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			}
			// 3으로만 나눠지는 경우 
			else if (N % 3 == 0) {//3으로 나눈 경우 1을 뺀경우
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			}
			// 2로만 나눠지는 경우 
			else if (N % 2 == 0) {//2로 나눈 경우 1을 뺀경우
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			}
			// 2와 3으로 나누어지지 않는 경우
			else {
				dp[N] = recur(N - 1) + 1;
			}
		}
		return dp[N];
	}
 
}


//참고 자료 https://st-lab.tistory.com/133
//백준 문제 https://www.acmicpc.net/problem/1463
