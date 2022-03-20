package ch01Basics;

import java.util.Scanner;

public class b3SumDoWhile {
	public static void main(String[] args) {
		
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("양의 정수를 입력하세요:");
			num = sc.nextInt();
		} while (num<=0);
		
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		
		System.out.println("합: "+sum);
		
	
	}
}
