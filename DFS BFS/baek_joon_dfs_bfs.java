import java.util.*;



public class Main {
	static int node[][]; // 인접행렬 배열
	static int visit[]; // 노드의 방문여부 표시 배열
	static Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 큐
	static void dfs(int x) { // DFS 메소드 재귀호출 반복한다.
		if(visit[x] == 1) return; //이미 방문한 노드라면 종료한다.
		
		visit[x] = 1; //방문하지 않은 노드라면 방문여부를 표시하고 출력한다.
		System.out.print(x+" ");
		for(int i =1;i<node.length;i++) { // 인접행렬의 경우 행열이 대각선을 기준으로 대칭이 되므로 행 또는 열을 기준으로만 탐색하면된다.			
			if(node[x][i]==1) { // 방문하지 않은 노드의 인접 노드일 경우
				
				dfs(i); // 해당 노드로 이동
			}
		}
	}
	
	static void bfs(int x) { //BFS 메소드 큐를 이용해 구현
		      
		queue.offer(x); // 큐에 시작 노드 삽입
		visit[x] = 1; // 시작 노드를 방문 표시
		while(!queue.isEmpty()) { // 공백큐가 될 때까지 반복
			x = queue.poll(); // 큐에서 하나 꺼낸다.
			System.out.print(x+" "); // 출력
			for(int i =1;i<node.length;i++) { // 큐에서 꺼낸 노드와 연결된 노드를 탐색			
				if(visit[i]!=1 && node[x][i]==1 ) {	// 큐에서 꺼낸 노드와 연결된 노드가 방문하지 않았던 노드라면
					queue.offer(i); // 큐에 삽입 후
					visit[i] =1; // 방문 표시
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int n= sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수 
		int v = sc.nextInt(); // 탐색 시작 노드
		
		node = new int[n+1][n+1];
		visit = new int[n+1];
		
		for(int i=0; i<m;i++) { // 인접행렬로 그래프를 구현
			
			int a =sc.nextInt();
			int b = sc.nextInt();
			node[a][b] =1;
			node[b][a]= 1;
		}
		
		
		
		dfs(v);
		Arrays.fill(visit, 0); // DFS이후 동일한 방문 여부배열을 사용하기 때문에 다시 0으로 초기화 해준다.
		System.out.println("");
		bfs(v);
		
	}
	
}
//참고자료 https://fbtmdwhd33.tistory.com/27
//백준 1260문제 https://www.acmicpc.net/problem/1260