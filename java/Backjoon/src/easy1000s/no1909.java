package easy1000s;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

//느낀점.. 정말 하란대로 풀어야 정답입니다 소리 들을수 있다..

public class no1001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();

		System.out.println(A-B);
		
        sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("두 숫자를 입력하세요: ");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//
//		int c = a-b;
////		int c=0;
////		if(a>b) {
////			c = a-b;
////		} else {
////			c = b-a;
////		}
//		
//		System.out.println("입력받은 숫자의 차:"+c);
//		
//		sc.close();
	}

}