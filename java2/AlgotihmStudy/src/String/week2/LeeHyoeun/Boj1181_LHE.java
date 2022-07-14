package String.week2.LeeHyoeun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Boj1181_LHE {
	public static void main(String args[]) throws IOException{
	   	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   	 
	   	 	int num = Integer.parseInt(br.readLine());
	   	 	
	   	 	String[] arr = new String[num];
	   	 	
	   	 	for(int i =  0 ; i < num ; i++) {
	   	 		arr[i] = br.readLine();
	   	 	}
//STEP1 정렬하기	   	 	
// 1.1 Arrays.sort()의 Comparator 재정의하기
	   	 	Arrays.sort(arr, new Comparator<String>() {
	   	 	 //1.2 Comparator에 있는 메서드인 compare 오버 라이딩하기
	   	 		@Override
	   	 		public int compare(String s1, String s2) {
	   	 		//  1.4 문자열 길이가 같다면 사전 순으로 정렬하기
	   	 			if(s1.length() == s2.length()) {
	   	 			return s1.compareTo(s2);
	   	 		}else { 
	   	 			// 1.3 문자열의 길이 정렬하기 (반환값은 양수, 음수로 판단(양수면 s1이 큰값))
	   	 			return s1.length() - s2.length();
	   	 		}
	   	 		
	   	 	}
	   	 	});
	   
	   	 	//STEP2 중복 제거
	   	 	// 가장 앞에 있는 문자열은 그냥 출력을 해준 뒤
	   	 	// 인덱스 1부터 그 이전 거와 문자열을 비교하여 같지 않다면, 출력
	   	 	System.out.println(arr[0]);
	   	 	for(int i = 1; i < num; i++) {
	   	 		if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
