package ch06Sort;

import java.util.Scanner;

// 단순 삽입 정렬
class c1InsertSort {
	static void c1InsertSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int j;
			int tmp = a[i];
			
			for(j=i; j>0 && a[j-1] > tmp; j--){
				a[j] = a[j-1];
			}
			
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단순 삽입 정렬");
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		c1InsertSort(x, nx); // 배열 x를 단순 삽입 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"]= "+x[i]);
		}
	}

}

