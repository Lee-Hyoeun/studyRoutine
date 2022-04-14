package easy1000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no1712 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
// 
// 
//		int A = sc.nextInt();	// 불변 비용
//		int B = sc.nextInt();	// 가변 비용
//		int C = sc.nextInt(); 	// 상품 가격
//        
//		if (C <= B) {
//			System.out.println("-1");
//		} 
//		else {
//			System.out.println((A/(C-B))+1);
//		}
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
 
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
	}
	
	
}
