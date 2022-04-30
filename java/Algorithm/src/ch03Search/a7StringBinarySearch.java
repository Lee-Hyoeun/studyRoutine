package ch03Search;
//문자열의 배열(JAVA의 키워드)에서 검색

import java.util.Arrays;
import java.util.Scanner;

public class a7StringBinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		// 자바에서 사용하는 키워드 일부
		String[] x = {
				"abstract", "assert", "boolean", "break", "byte",
				"case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else",
				"enum", "extends", "final", "finally", "float"
		};
		
		System.out.print("원하는 키워드를 입력: "); //키 값을 입력
		
		String ky = sc.next();
		
		int idx = Arrays.binarySearch(x, ky); //배열 x에서 값이 ky인 요소를 검색
		
		if (idx<0){
			System.out.println("해당 키워드가 없습니다.");
		} else {
			System.out.println("해당 키워드는 x["+idx+"]에 있습니다.");
		}
	}

}
