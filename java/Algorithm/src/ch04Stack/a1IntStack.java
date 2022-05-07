package ch04Stack;
// int형 스택

public class a1IntStack {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체
	
	// 실행시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}	
	}
	
	// 실행시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	// 생성자
	public a1IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { //생성할 수 없음
			max = 0;
			
		}
	}
	
	
	
	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= max) {	//스택이 가득 참
			throw new OverflowIntStackException();
		}
		
		return stk[ptr++] = x;
	}
	
	
	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) { //스택이 비어있음
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	

}
	
