package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no4949 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//무한루프
		while(true) {
			String input = br.readLine();
			//문자열의 자릿수를 비교할땐 char형으로 확인하기때문에 스택을 Character로 선언해준다.
			Stack<Character> stack = new Stack<Character>();
			
			//.이 입력되면 무한루프 종료
			if(input.equals(".")) break;
			
			for(int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				
				//여는 괄호면 스택에 저장
				if(ch == '(' || ch == '[') stack.push(ch);
				
				//닫는 괄호일때 각 조건을 걸어준다.
				if(ch == ')') {
					if(stack.empty()) {
						stack.push(ch);
						break;
					}
					
					if(stack.peek() == '(') stack.pop();
					else break;
				}else if(ch == ']') {
					if(stack.empty()) {
						stack.push(ch);
						break;
					}
					
					if(stack.peek() == '[') stack.pop();
					else break;
				}
			}
			//스택이 비어있는지에대한 여부에 따른 다른 출력값을 sb에 저장
			if(stack.isEmpty()) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		System.out.println(sb);
	}

}

