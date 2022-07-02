package easy1000s;

import java.util.Scanner;

public class no1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();
		long hap = 0;
		int cnt = 0;
		
		for(int i=0; ;i++) {
			if(hap>S)
				break;
			hap += i;
			cnt ++;
			
			System.out.println(cnt-1);
			
			sc.close();
		}
		
	}

}
