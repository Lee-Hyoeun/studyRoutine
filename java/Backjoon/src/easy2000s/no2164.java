package easy2000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class no2164 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			que.offer(i);
		}
		
		while(que.size() > 1) {
			que.poll();
			que.offer(que.poll());
		}
		System.out.println(que.peek());
	}

}

