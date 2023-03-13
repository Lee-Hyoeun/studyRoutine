package easy2000s;

import java.util.*;

public class no2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 입력한 숫자만큼 반복
		for (int i = 0; i < num; i++) {
			// 공백 -> 0 0 / 1 1 / 2 2 / 
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별표시 			2n-1개씩 표시	2개씩감소
			for(int j = 0; j < (2 * num - 1) - (2 * i); j++){	// 별
				System.out.print("*");
			}
			System.out.println();
		}
		// 입력한 숫자보다 1개 빼서 반복
		for (int i = 0; i < num-1; i++) {
			// 공백 -> 0 4 / 1 3 / 2 2 /
			for (int j = 1; j < (num-1) - i; j++) {
				System.out.print(" ");
			}
			// 별표시			3+2n개씩 표시
			for(int j = 0; j < 3 + (2 * i); j++){	// 별
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
