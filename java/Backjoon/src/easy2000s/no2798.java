package easy2000s;
// 블랙잭

import java.util.Scanner;

public class no2798 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int list[] = new int[N];
		int max = 0, sum = 0;
		
		for(int i=0; i<N; i++) {
			list[i] = sc.nextInt();
		}
        
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					sum = list[i] + list[j] + list[k];
					if(sum > max && sum <= M) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}

}
