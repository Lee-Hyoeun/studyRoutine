package etc;

import java.util.*;

public class no10030 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		int avg=0;
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			// 5의배수
			if (score[i] % 5 != 0) {
				i--;
				System.out.println("5의배수를 입력해주세요");
			}
			
			if (score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		// 평균 = 총점 / 학생수
		avg = sum / score.length;
		System.out.println(avg);
				
	}
}

