package easy1000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class no1085 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int w = sc.nextInt();
//		int h = sc.nextInt();
//        
//		int x_min = Math.min(x, w-x);	// x축 최소거리
//		int y_min = Math.min(y, h-y);	// y축 최소거리
//        
//		// x와 y축 최소거리 중 가장 작은 값
//		System.out.println(Math.min(x_min, y_min));
//	}
// 
//}


public class no1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
        
		int x_min = Math.min(x, w-x);	
		int y_min = Math.min(y, h-y);
        
		System.out.println(Math.min(x_min, y_min));
	}
 
}