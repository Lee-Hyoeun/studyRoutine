package ch01Basics;
// 논리 연산과 드모르간 법칙
//입력한 값을 양수로 제한(양수 10~99)

import java.util.Scanner;

public class c1Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;
		
		System.out.println("2자리 정수를 입력하시오.");
		
		do {
			System.out.println("입력: ");
			no = sc.nextInt();
			
		} while (no<10 || no>99);
		
		System.out.println("입력한 변수의 값: "+ no);
	}

}
