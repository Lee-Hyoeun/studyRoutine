package etc;

import java.util.Scanner;
 
public class no3003 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
 
		king = king - in.nextInt();
		queen = queen - in.nextInt();
		rook = rook - in.nextInt();
		bishop = bishop - in.nextInt();
		knight = knight - in.nextInt();
		pawn = pawn - in.nextInt();
 
		// 참고로 출력형식을 보면 각 변수들사이에 공백으로 구분 된한 줄로 출력해야한다.
		// 즉, 개행(줄바꿈)이 발생하는 println을 쓰면 안된다.
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);		
		
	}
}
