package easy2000s;

import java.util.Scanner;

public class no20145{
	public static void main(String[] args) {		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int num = sc.nextInt();
			sum+=num;
		}
		System.out.println(sum-(cnt-1));
	}
}
