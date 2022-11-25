import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
	// 88번 3의 배수는 출력x 1씩증가시켜 n까지출력
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(true) {
			for(int i=1; i<=num; i++) {
				if(i%3!=0) {
					System.out.printf("%d ", i);
				} else {
					System.out.print("");
				}
			}
			
			break;
		}
		
	}
}
		



// 84번 RGB 섞어낼 수 있는 조합과 총가짓수(Scanner는 시간초과라서 버퍼이용!)
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class Main {
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String data[] = br.readLine().split(" ");
//		
//		int count = 0;
//		
//		int r = Integer.parseInt(data[0]);
//		int g = Integer.parseInt(data[1]);
//		int b = Integer.parseInt(data[2]);
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		for(int i=0; i<r; i++) {
//			for(int j=0; j<g; i++) {
//				for(int k=0; k<b; k++) {
//					bw.write(i+" "+j+" "+k+"\n");
//					count++;
//				}
//			}
//		}
//		
//		bw.write(String.valueOf(count));
//		bw.flush();
//	}
//}