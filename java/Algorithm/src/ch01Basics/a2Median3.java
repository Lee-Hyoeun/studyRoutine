package ch01Basics;
// 3개의 정수값을 입력하고 중앙값을 구한 다음 출력하기

import java.util.Scanner;

class a2Median3{
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			} else if(a<=c) {
				return a;
			} else {
				return c;
			}
		} else if(a>c) {
			return a;
		} else if(b>c) {
			return c;
		} else {
			return b;
		}
	}
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값 구하기! 세 정수를 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("중앙값: "+ med3(a, b, c));

		sc.close();
	}
}



// 