import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        //ArrayList로 그래프를 선언
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<edge.length; i++) {
        	graph.add(new ArrayList<Integer>());
        }
        
        int fi, se;//노드와 노드간의 연결
        for(int[] node:edge) {
        	fi = node[0];
        	se = node[1];
        	graph.get(fi).add(se);
        	graph.get(se).add(fi);
        }
        
        int[] count = new int[n+1];//1과의 거리저장
        boolean[] visited = new boolean[n + 1];//방만한 곳과 1과의 거리
        Queue<Integer> q = new LinkedList<>();//bfs 
        q.add(1);
        visited[0]=visited[1]=true;//0과 1을 방문 했다는 표시
        int now;//현재 
        while(!q.isEmpty()){//bfs 작성
        	now=q.poll();
        	for(int g : graph.get(now)) {
        		if(!visited[g]){
        			count[g]=count[now]+1;//1과의 길이 저장
                    visited[g]=true;//방문했다면
                    q.add(g);//큐에 저장
        		}
        	}
        }
        
        int max = 0; //초기 노드 1과 가장 멀리 떨어진 값 저장
        for( int cnt : count) {
        	if(max<cnt){
        		max=cnt;
        		answer = 1;
        	}
        	else if(max==cnt) answer++;
        }
        return answer;
    }
}

//참고 자료:https://iamheesoo.github.io/blog/algo-prog49189

//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/49189?language=java