package etc;

import java.util.Scanner;

public class no10871_2{

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int X = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] < X) {
				System.out.println(a[i]);
			}
		}
		
	}
}
