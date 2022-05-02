package easy2000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			//각 호마다 사람 수를 저장
			int[] arr = new int[N];
			
			//0층에 해당하는 사람 수를 저장
			for(int j = 0; j < N; j++) {
				arr[j] = j + 1;
			}
			
			//K층까지 사람 수를 연산해서 저장
			for(int j = 0; j < K; j++) {
				for(int k = 1; k < N; k++) {
					arr[k] += arr[k - 1];
				}
			}
			//원하는 층을 구했으면 마지막 인덱스에 저장 된 값이 원하는 출력값.
			System.out.println(arr[N - 1]);
		}
	}

}


