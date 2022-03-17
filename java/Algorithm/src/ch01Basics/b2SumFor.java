package ch01Basics;

import java.util.Scanner;

// 1부터 N까지의 합 구하기


public class b2SumFor {
	public static void main(String[] args) {
	
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			
			sum+= i;
		}
		
		System.out.println("1부터 입력한 정수까지의 합: "+sum);
		
	}
}
