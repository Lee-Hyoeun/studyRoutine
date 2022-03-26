package ch02Array;

import java.util.Scanner;

// 입력 받은 10진수를 2진수~36진수로 기수 변환하여 나타냄

public class a8CardConvRev {
	// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; //변환하는 정수
		int cd; //기수
		int dno; //변환후의 자릿수
		int retry; //재시도
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = sc.nextInt();
			} while(no<0);
			
			do {
				System.out.print("어떤 진수로 변환? (2~36): ");
				cd = sc.nextInt();
			} while(cd<2 || cd>36);
			dno = cardConvR(no, cd, cno); //no를 cd진수로 변환
			
			System.out.print(cd+"진수로는 ");
			for(int i=dno-1; i>=0; i--) {
				System.out.print("cno[i]");
			}
			System.out.println("입니다.");
			
			System.out.print("한번 더? (1.예 / 2.아니오): ");
			retry = sc.nextInt();
		} while(retry == 1);
		
	}

}
