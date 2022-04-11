package easy2000s;

import java.util.Scanner;

public class no7568 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int list[][] = new int[N][3];

		for(int i=0; i<N; i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
			list[i][2] = 1;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i==j) {
					continue;
				}
				else if(list[i][0]<list[j][0] && list[i][1]<list[j][1]) {
					list[i][2]++;
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.print(list[i][2]+" ");
		}
	}
}
