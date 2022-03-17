package ch01Basics;

import java.util.Scanner;

// 1부터 N까지의 합 구하기


public class b1SumWhile {
	public static void main(String[] args) {
	
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=num) {
			sum =+ i;
			i++;
		}
		
		System.out.println("i값이 n+1?: "+i);
		System.out.println("1부터 입력한 정수까지의 합: "+sum);
		
	}
}
