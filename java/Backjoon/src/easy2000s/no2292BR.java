package easy2000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2292 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a = 1;
		int b = 0;
		int count = 1;
		
		//1이 입력되면 1이 출력되야 하기 때문에 반복문이 진행되면 안된다.
		while(N != 1) {
			//끝만보자면 1, 7, 19, 27, ... 이다. 패턴을 연산화하자.
			a += (b * 6);
			//범위안에 들어오면 반복문 종료
			if(N <= a) break;
			
			count++;
			b++;
		}
		System.out.println(count);
	}

}


