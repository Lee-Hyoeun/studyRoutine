package ch05Recursive;
import java.util.Scanner;

import ch04Stack.a1IntStack;
//재귀함수 이해하기

public class RecurX2 {
	// 꼬리 재귀를 제거했습니다.
	static void recur(int n) {
		a1IntStack s = new a1IntStack(n);
		
		while(true) {
			if(n>0) {
				s.push(n);	// n의 값을 푸시
				n=n-1;
				continue;
			}
			if(s.isEmpty()!=true) {	// 스택이 비어있지 않다면
				n=s.pop();			// 저장하고 있던 스택의 값을 팜
				System.out.println(n);
				n=n-2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int x = sc.nextInt();
		
		recur(x);
	}
}
