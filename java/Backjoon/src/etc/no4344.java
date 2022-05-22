package etc;

import java.util.*;

public class no4344 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int numberPeople, sum, overPeople;
		double r, per;
		
		for (int i = 0; i < count; i++) {
			numberPeople = sc.nextInt();
			sum = 0;
			overPeople = 0;
			r = 0;
			
			int score[] = new int[numberPeople];
			for (int j = 0; j < score.length; j++) {
				score[j] = sc.nextInt();
				sum = sum + score[j];
			}
			for (int j = 0; j < score.length; j++) {
				if (score[j] > (double)sum/numberPeople) {
					overPeople++;
				}
			}
			
			r = (double)overPeople/numberPeople * 100;
			
			per = Math.round(r*1000)/1000.0;
			
			System.out.printf("%.3f", per);
			System.out.println("%");
		}
	}
}
