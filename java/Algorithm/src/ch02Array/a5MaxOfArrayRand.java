package ch02Array;
// 난수를 이용해 키의 최댓값 구하기

import java.util.Scanner;

public class a5MaxOfArrayRand {
	static int maxOf(int[] a) {
		
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람의 수: ");
		
		int num = sc.nextInt();	//배열의 요소개수
		
		int[] height = new int[num]; //요소수가 num인 배열을 생성
		
		for(int i=0; i<num; i++) {
			System.out.println("(height["+i+"] : ");
			height[i] = sc.nextInt();
		}
		
		System.out.println("최댓값은 "+maxOf(height)+" 입니다.");
	}
}
