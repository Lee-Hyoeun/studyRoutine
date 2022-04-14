package easy1000s;

import java.util.Scanner;

public class no1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
 
		int A = sc.nextInt();	// 불변 비용
		int B = sc.nextInt();	// 가변 비용
		int C = sc.nextInt(); 	// 상품 가격
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
	}
}
