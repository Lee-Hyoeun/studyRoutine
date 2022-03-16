package ch01Basics;

import java.util.Scanner;

//3개의 정수를 입력받고 그 가운데 '최대값' 구하기

public class a1Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세개의 정수를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}

		System.out.println("�ִ밪: "+max);
	}

}
