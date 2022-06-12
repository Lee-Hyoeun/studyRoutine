package 1000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1107 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		boolean[] button = new boolean[10];
		int now = 100;
		
		//고장난 버튼 가려내기
		if(M > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) {
				button[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		//이하 채널 구하기
		int num = N;
		while(num > -1) {
			String S = String.valueOf(num);
			boolean check = true;
			for(int i = 0; i < S.length(); i++) {
				for(int j = 0; j < 10; j++) {
					if(S.charAt(i) - '0' == j) {
						//채널의 자릿수가 j지만, j가 누를수 없는 버튼이라면 이 번호는
						//번호 입력으로 불가능한 채널인 것이다. check에 false를 저장해서 표시해주자.
						if(button[j]) {
							check = false;
						}
						break;
					}
				}
				//check가 false면 불가능한 채널이니 반복문을 종료한다.
				if(!check) break;
			}
			//check가 true면 그 채널은 조건을 만족하는 채널이다.
			if(check) {
				break;
			}
			num--;
		}
		
		//이상 채널 구하기
		int num2 = N;
		while(num2 <= 1000000) {
			String S = String.valueOf(num2);
			boolean check = true;
			for(int i = 0; i < S.length(); i++) {
				for(int j = 0; j < 10; j++) {
					if(S.charAt(i) - '0' == j) {
						if(button[j]) {
							check = false;
						}
						break;
					}
				}
				if(!check) break;
			}
			if(check) {
				break;
			}
			num2++;
		}
		//num이 0이하로 내려갔으면 불가능한 채널이기때문에 100만을 저장해서 결과값에 올 수 없게 한다.
		if(num < 0) num = 1000000;
		else num = (N - num) + String.valueOf(num).length();
		num2 = (num2 - N) + String.valueOf(num2).length();
		//누르는 횟수가 제일 적은 값을 저장
		int result = Math.min(Math.abs(now - N), Math.min(num, num2));
		System.out.println(result);
	}

}


