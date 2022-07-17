package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no14651 {

	public static final int MOD = 1_000_000_009;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 0,1,2 로 만들 N자리 3의 배수
		
		//D[i] = 0,1,2만 가지고 만든, i자리 3의 배수의 개수 
		long[] D = new long[33334];
		D[1] = 0;
		D[2] = 2; 
//		12 21 
		D[3] = 6;
//		102,111, 120, 201, 210, 222, 
		D[4] = 18;
//		1002, 1020, 1200, 2220, 2202, 2022, 1110, 1101, 1011,
//		2211, 2112, 2211, 1212, 2121, 2100, 2010, 2001, 1122,	
		
		for(int i=5; i<=N; i++) {
			D[i] = (D[i-1]*3) % MOD;
		}
		
		System.out.println(D[N]);
		

		
		
	}
	
	
	
}


