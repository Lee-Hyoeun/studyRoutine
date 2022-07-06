package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no15552 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        // StringTokenizer를 선언한 이유는,
        // 요구사항이 입력받을 때 한줄로 받도록 되어있기 때문이다.
        // split처럼 사용할수있다.
        
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            bw.write(A+B + "\n");
            // 개행 시켜주는 문자열인 \n을 더해주면,
            // A+B는 자동으로 String으로 바뀐다.
        }
        bw.flush();
        bw.close();
        br.close();

	}
}
