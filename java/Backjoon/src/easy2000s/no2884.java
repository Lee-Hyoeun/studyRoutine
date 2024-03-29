package easy2000s;

// 방법 2-1
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class no2884 {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	
/*    
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M= 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H+" "+(M-45));
		}
        
*/
	}
}

