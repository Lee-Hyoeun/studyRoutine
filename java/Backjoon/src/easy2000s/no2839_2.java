package easy2000s;

import java.util.Scanner;

public class no2839_2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int pocket = 0;
	
	while(true) {
		if(n%5==0) {
			pocket += n/5;
			System.out.println(pocket);
			break;
		}
		else {
			n -= 3;	//n-3한 값
			pocket++;			
		}
		
		if (n<0){
			System.out.println(-1);
			break;
		}
	}
}
}
