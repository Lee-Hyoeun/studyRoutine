package test;
import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		
		while(true) {
			if(N==1) {
				break;
			} else if(N%K==0) {
				N/=K;
				cnt++;
			} else {
				N-=1;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
