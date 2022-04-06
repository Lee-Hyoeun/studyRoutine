package ch02Array;
// 1000 이하의 소수를 열거(버전1)

public class b3PrimeNumber {
	public static void main(String[] args) {
		int cnt = 0; //나눗셈 횟수
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				cnt++;
				if(n%i==0) { //나누어 떨어지면 소수가 아니고
					break;	//반복 불필요
				}
			}
			if(n==i) {// 마지막까지 나누어떨어지지 않음
				System.out.println(n);
			}
		}
		System.out.println("나눗셈을 수행한 횟수: "+cnt);
	}

}
