import java.io.*;
import java.util.*;

public class Main {
    static int N,C;
    static int [] house;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        house = new int[N];
        for(int i = 0; i < N; ++i)
        {
            house[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(house);//이분탐색은 중간값보다 왼쪽은 작고 오른쪽은 커야되기때문에 오름차순 정렬

        int left = 1; //최소 간격
        int right = house[N-1] - house[0]; //최대 간격

        while(left <= right)
        {
            int mid = (left + right) / 2;//중간값 

            if(set(mid) >= C) left = mid+1;// set - 사용자가 메소드를 호출 시 데이터를 삽입해주는 역할을 담당합니다
            else right = mid-1;
        }
        System.out.print(left-1);
    }
    static int set(int dist)//dist 변수를 호출하면 set 그것을 설정해주는 역할
    {
        int cur = house[0];
        int cnt = 1;
        for(int i = 1; i < N; ++i)
        {
            if((house[i] - cur) >= dist)
            {
                cur = house[i];//cur은 값이 추가될때마다 노드 맨끝을 참조하는 참조 변수
                cnt++;
            }
        }
        return cnt;
    }
}

//문제 https://www.acmicpc.net/problem/2110
//참고자료 https://intrepidgeeks.com/tutorial/install-baizhun-2110-router-java-java
//set 참고 자료 https://akdl911215.tistory.com/261
