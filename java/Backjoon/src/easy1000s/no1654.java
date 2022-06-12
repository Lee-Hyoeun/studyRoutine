package 1000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1654 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];
		int end = 0;
		
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			//입력값중 제일 큰 값을 저장
			if(end < arr[i]) end = arr[i];
		}
		
		//시작은 1부터
		int start = 1;
		//중간 값
		int mid = (end + start) / 2;
		//출력 값을 저장 할 변수이다. 
		//랜선이 하나이고, 필요한 랜선 개수도 1개일 경우 입력 값을 출력해야하기 때문에 최댓값을 저장.
		int result = end;
		
		//남는 범위값이 없어질때까지 반복
		while(end - start >= 0) {
			//랜선 개수의 합을 저장 할 변수, int형을 넘어갈 수 있기 때문에 sum 변수만 long형으로 선언
			long sum = 0;
			
			for(int i = 0; i < K; i++) {
				sum += (arr[i] / mid);
				if(sum > N) break;
			}
			
			//문제를 보면 필요한 개수가 딱맞아 떨어지지 않을 때는 그 이상의 개수중 최솟값으로 구하라 했다.
			//그러니 필요한 개수 이상일때 값들을 result에 저장
			if(sum >= N) {
				start = mid + 1;
				result = mid;
			}else {
				end = mid - 1;
			}
			
			mid = (end + start) / 2;
		}
		System.out.println(result);
	}

}

