package ch01Basics;

import java.util.Scanner;

// 조건 판단과 분기
// 입력한 정숫값의 부호를 판단하여 출력하는 프로그램

public class a3JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수입니다.");
		} else if(num<0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	
		sc.close();
	}
}
