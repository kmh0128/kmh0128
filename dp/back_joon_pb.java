import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//num으로 실행 다음 정수를 읽어오고 리턴
		
		int[][] memo = new int[41][2];//40번째 수까지 구해야되니깐 인덱스가 0번부터 시작이므로 41 
		
		memo[0][0] = 1;//둘다 0과 1이 나오는 상황을 설정
		memo[0][1] = 0;
		memo[1][0] = 0;
		memo[1][1] = 1;
		
		int n;
		int[] idx = new int[num]; // 입력한 n을 인덱스 형태로 저장. (출력용)
		for(int i = 0; i < num; i++) {
			n = sc.nextInt();
			idx[i] = n;
			if(n == 0 || n == 1) // n이 0이나 1은 미리 대입했으므로 continue
				continue;
			for(int j = 2; j <= n; j++) {// 2부터는 따로 설정해줄 필요가없으니 n만큼 반복
				memo[j][0] = memo[j-1][0] + memo[j-2][0];
				memo[j][1] = memo[j-1][1] + memo[j-2][1];
			}
		}
		
		for(int i = 0; i < num; i++)
			System.out.println(memo[idx[i]][0]+" "+memo[idx[i]][1]);
		
		sc.close();//리턴한 정수값들이 남기 때문에 sc.close로 종료
		return;
	}
}
//참고자료 https://binghedev.tistory.com/9
//참고자료 scanner https://mine-it-record.tistory.com/103
                //  https://mine-it-record.tistory.com/103