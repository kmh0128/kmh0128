import java.util.*;
import java.io.*;

public class Main {
	static int[][][]dp = new int[21][21][21];//if문에 20을 넘으면 20으로 설정될것이기 때문에 20까지의 배열생성
	
	static int x(int a, int b, int c) {//0<= a,b,c<=20의 값에서 한번이라도 계산한적있는 값이면 반환
		if(isRange(a,b,c) && dp[a][b][c]!=0) return dp[a][b][c];
		
		if (a <= 0 || b <= 0 || c <= 0) return 1;
		// dp[a][b][c]에 값을 저장
		if (a > 20 || b > 20 || c > 20) return dp[20][20][20] = w(20, 20, 20);
		//  a, b, c가 20을 넘지 않음
		if (a < b && b < c)
			return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	static boolen isRange(int a, int b, int c) {//a하고 b 그리고 c의 인덱스가 0아래로 20위로의 인덱스를 넘지않게 체크
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}

	public static void main(String[] args) throws IOException {
		BufferReader br = new BufferReader(new InputStreamReader(System.in)); 반복해서 읽어온다
		BufferWriter bw = new BufferWriter(new outputStreamReader(System.out)); 반복해서 출력한다
		StringTokenizer st;//특정 문자열을 분리할때 사용하는 클래스
		
		while (true) {
    		st = new StringTokenizer(br.readLine());//한줄씩 읽어내린다
    		
    		int a = Integer.parseInt(st.nextToken());//integer.parseInt는 문자열을 숫자로 변환하는 방법
    		int b = Integer.parseInt(st.nextToken());//nexttoken 다음 토큰을 읽어온다
    		int c = Integer.parseInt(st.nextToken());
    		
    		// a, b, c가 모두 -1이면 종료
    		if (a == -1 && b == -1 && c == -1) break;
    		
    		// 출력
    		bw.write("w(" + a + ", " + b + ", " + c + ") = "
    				+ w(a, b, c) + "\n");
    	}
        bw.flush(); //남아있는 데이터를 모두 출력시킴
        bw.close();
        br.close();

	}

}
//참고자료 https://min-wachya.tistory.com/47?category=844670
// integer.parseInt https://jamesdreaming.tistory.com/125
//백준 신나는 함수