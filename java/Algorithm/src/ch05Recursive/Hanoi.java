package ch05Recursive;

import java.util.Scanner;

// 하노이의 탑

public class Hanoi {
	// no개의 원반을 x번 기둥에서 y번 기둥으로 옭김
	
	static void move(int no, int x, int y) {
		if(no>1) {
			move(no-1, x, 6-x-y);
		}
		
		System.out.println("원반["+no+"]을 "+x+"기둥에서 "+y+"기둥으로 옮김");
		
		if(no>1) {
			move(no-1,6-x-y,y);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("하노이의 탑");
		System.out.println("원반 갯수: ");
		int n = sc.nextInt();
		
		move(n,1,3);	// 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
	
	}
}