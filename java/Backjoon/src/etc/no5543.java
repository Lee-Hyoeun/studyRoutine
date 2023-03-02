package etc;

import java.util.*;

public class no5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bugger[] = new int[3];
		int drink[] = new int[2];
		int minPrice = 0;
		for (int i = 0; i < bugger.length; i++) {
			bugger[i] = sc.nextInt();
			if (bugger[i] < 100 || bugger[i] > 2000) {
				System.out.println("가격은 100원이상 2000원 이하입니다.");
				i--;
			}
		}
		for (int i = 0; i < bugger.length-1; i++) {		
			for (int j = i + 1; j < bugger.length; j++) {
				if (bugger[i] > bugger[j]) {
					int temp = bugger[i];
					bugger[i] = bugger[j];
					bugger[j] = temp;
				}
				
			}
		}
		for (int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
			if (drink[i] < 100 || drink[i] > 2000) {
				System.out.println("가격은 100원이상 2000원 이하입니다.");
				i--;
			}
		}
		for (int i = 0; i < drink.length-1; i++) {		
			for (int j = i + 1; j < drink.length; j++) {
				if (drink[i] > drink[j]) {
					int temp = drink[i];
					drink[i] = drink[j];
					drink[j] = temp;
				}
				
			}
		}
		
		
		minPrice = bugger[0] + drink[0] - 50;
		System.out.println(minPrice);
		
	}
}

