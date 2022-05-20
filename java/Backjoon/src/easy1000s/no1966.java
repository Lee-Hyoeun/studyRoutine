package easy1000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no1966 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			Integer[] arr = new Integer[N];
			Queue<Integer> que = new LinkedList<Integer>();
			Queue<Boolean> bool = new LinkedList<Boolean>();
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				arr[j] = num;
				que.offer(num);
				
				if(j == M) bool.offer(true);
				else bool.offer(false);
			}
			
			//내림차순 정렬
			Arrays.sort(arr, Collections.reverseOrder());
			//출력 값을 저장 할 변수
			int count = 0;
			
			int index = 0;
			while(index < N) {
				if(arr[index] != que.peek()) {
					que.offer(que.peek());
					que.poll();
					bool.offer(bool.peek());
					bool.poll();
				}else {
					//== true는 생략가능
					if(bool.peek() == true) break;
					que.poll();
					bool.poll();
					index++;
					count++;
				}
			}
			System.out.println(count + 1);
		}
	}

}


