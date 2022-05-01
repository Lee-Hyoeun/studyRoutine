package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no9012 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String S = br.readLine();
			
			//문자열의 각 자리의 값을 확인할때는 char형태로 바꿔서 확인하기 때문에 스택도 Character형으로 해준다.
			Stack<Character> stack = new Stack<Character>();
			
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == '(') {
					stack.push(S.charAt(j));
				}else {
					//비어있는지를 먼저 본다.
					if(stack.empty()) {
						stack.push(S.charAt(j));
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.empty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}

