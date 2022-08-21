package easy1000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//public class no1436_2 {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
// 
//		int num = 666;
//		int count = 1;
//        
//		while(count != N) {
//			num++;
//			if(String.valueOf(num).contains("666")) {
//				count++;
//			}
//		}
//		System.out.println(num);
//	}
//}

public class no1436_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		int num = 666;
		int count = 1;
        
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}
