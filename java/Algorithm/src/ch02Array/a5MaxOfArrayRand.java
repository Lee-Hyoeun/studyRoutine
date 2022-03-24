package ch02Array;
// 난수를 이용해 키의 최댓값 구하기

import java.util.Random;
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
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람의 수: ");
		
		int num = sc.nextInt();	//배열의 요소개수
		
		int[] height = new int[num]; //요소수가 num인 배열을 생성
		
		System.out.println("키 값은 아래와 같습니다.(난수)");
		for(int i=0; i<num; i++) {
			height[i] = 100+rand.nextInt(90); // 요소의 값을 난수로 결정
			System.out.println("height["+i+"] : "+ height[i]);
		}
		
		System.out.println("최댓값은 "+maxOf(height)+" 입니다.");
	}
}
