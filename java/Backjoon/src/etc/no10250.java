package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class no10250 {
//public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
// 
//		int T = in.nextInt();	// 테스트 케이스
// 
// 
//		for(int i = 0; i < T; i++) {
//			
//			int H = in.nextInt();
//			int W = in.nextInt(); 	// 쓸모없는 변수다.
//			int N = in.nextInt();
//			
//			if(N % H == 0) {
//				System.out.println((H * 100) + (N / H));
// 
//			} else {
//				System.out.println(((N % H) * 100) + ((N / H) + 1));
//			}
//		}
//	}
//}
//123556

public class no10250 {
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스
 
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			int H = Integer.parseInt(st.nextToken());
			st.nextToken();			// W 는 그냥 버린다.
			int N = Integer.parseInt(st.nextToken());
 
			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
 
			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.print(sb);
 
	}
}
