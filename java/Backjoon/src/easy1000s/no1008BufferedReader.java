package easy1000s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1008BufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		double A = Integer.parseInt(str[0]);
		double B = Integer.parseInt(str[1]);
		
		System.out.println(A/B);
		
		}
}
