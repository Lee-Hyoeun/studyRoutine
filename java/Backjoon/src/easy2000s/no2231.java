package easy2000s;

import java.util.Scanner;

public class no2231 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum, num;
		int check = 0;

		for(int i=0; i<N; i++) {
			sum = i;
			num = i;
			while(num>0) {
				sum += num%10;
				num /= 10;
			}
			if(sum==N) {
				System.out.println(i);
				check = 1;
				break;
			}
		}
		if(check==0) {
			System.out.println(0);
		}
	}
}
