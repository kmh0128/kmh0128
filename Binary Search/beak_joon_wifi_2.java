import java.io.*;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());//집의 개수 
        int c = Integer.parseInt(st.nextToken());// 공유기의 개수 integer형으로 변환

        int[] house = new int[n];//집의 배열을 n으로 삽입

        for (int i=0; i<n; i++) {
            house[i] = Integer.parseInt(bf.readLine());//n길이 만큼 반복
        }

        Arrays.sort(house);// 이분탐색은 중간값을 기준으로 왼쪽은 작은값 오른쪽은 큰값이 되어야 함으로 오른차순 

        int start = 1;//1로 초기화
        int end = house[n-1] - house[0];

        int result = 0;//결과값은 0으로 초기화


        while (start <= end) {
            int mid = (start+end)/2;//중간값을 기준으로
            int left = house[0];//가장 왼쪽 
            int cnt = 1;//공유기 갯수 ->가장 왼쪽집에 하나 설치하고 시작해서 1

            for (int i=1; i<n; i++) {
                if (house[i]-left>=mid) {
                    //house[i]-left = 간격
                    //최소거리가 중간값이 mid보다 크면 카운트를 증가해준다
                    cnt++;
                    left = house[i];
                }
            }

            if (cnt>=c) {
                //실제 설치될 공유기보다 많이 설치가된격우 오른쪽으로 이동해 더 긴 간격 맞춰줘야함
                result = mid;
                start = mid+1;
            } else {
                //공유기를 c보다 적게 설치하면 왼쪽으로 이동해 더 짧은 간격으로 맞춰줘야함
                end = mid-1;//스타트를 1로 시작해서 하나를 빼준다
            }
        }

        System.out.println(result);

    }
}
// 백준 2110 공유기 설치 (https://www.acmicpc.net/problem/2110)
// 참고 https://hidelookit.tistory.com/168
