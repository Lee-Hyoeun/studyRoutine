import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data[] = br.readLine().split(" ");
		
		int count = 0;
		
		int r = Integer.parseInt(data[0]);
		int g = Integer.parseInt(data[1]);
		int b = Integer.parseInt(data[2]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=0; i<r; i++) {
			for(int j=0; j<g; i++) {
				for(int k=0; k<b; k++) {
					bw.write(i+" "+j+" "+k+"\n");
					count++;
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
	}
}