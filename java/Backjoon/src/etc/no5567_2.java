package etc;

import java.util.*;

public class no5567_2 {
	public static ArrayList<Integer>[] adjList;
	public static int[] visited;
	public static int ans = 0;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		adjList = new ArrayList[N + 1];
		visited = new int[N + 1];

		for(int i = 1; i <= N; i++) {
			adjList[i] = new ArrayList<Integer>();
		}

		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adjList[a].add(b);
			adjList[b].add(a);
		}

		bfs();
		
		System.out.println(ans);
	}

	public static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		visited[1]++;

		while(!queue.isEmpty()) {
			int v = queue.poll();

			// 친구의 친구까지 확인 완료 
			if(visited[v] >= 3) {
				break;
			}

			for(int next : adjList[v]) {
				if(visited[next] == 0) {
					visited[next] = visited[v] + 1;
					queue.add(next);
					ans++;
				}
			}
		}
	}
}
