package easy1000s;

import java.util.*;

public class no1546_2{
	public static void main(String[] args) {
		/*
		 	두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
			수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sub[] = new int[N];
		double M = 0;
		for (int i = 0; i < sub.length; i++) {
			sub[i] = sc.nextInt();
		}
		for (int i = 0; i < sub.length; i++) {
			if (M < sub[i]) {
				M = (double)sub[i];
				i--;
			}
		}
		double newSub[] = new double[N];
		double sum = 0;
		for (int i = 0; i < sub.length; i++) {
			newSub[i] = (double)sub[i]/M * (double)100;
			sum = newSub[i] + sum;
		}
		System.out.println(sum/(double)N);
	}
}
