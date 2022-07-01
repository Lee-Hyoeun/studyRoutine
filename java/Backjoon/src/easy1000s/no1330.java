package easy1000s;

import java.util.Scanner;

public class no1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		// .next() -> 공백 제거
		// /nextLine() -> 공백 유지
		String splitArr[] = num.split(" ");
		int n1, n2;
		n1 = Integer.parseInt(splitArr[0]);
		n2 = Integer.parseInt(splitArr[1]);
		if (n1 == n2) {
			System.out.println("==");
		}
		else if (n1 > n2) {
			System.out.println(">");
		}
		else {
			System.out.println("<");
		}
		
	}
}
