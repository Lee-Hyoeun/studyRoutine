package ch06Sort;

// 배열 나누기


public class e1Partition {
	// 배열 요소 a[idx]와 a[idx2]의 값을 바꾸기
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	// 배열을 나누기
	static void e1Partition(int[] a, int n) {
		int pl = 0;	// 왼쪽 커서
		int pr = n-1;	// 오른쪽 커서
		int x = a[n/2];	// 피벗(가운데 위치 값)
		
		do {	
				// 배열 a를 피벗 x를 기준으로 나눔
			while (a[pl]<x) pl++;
			while (a[pr]>x) pr--;
			if (pl<=pr)
					swap(a, pl++, pr--);
		} while(pl<=pr);
		
		System.out.println("피벗의 값은 "+x+" 입니다.");
		
		System.out.println("피벗 이하의 그룹");
		for(int i=0; i<=pl-1; i++)
			System.out.print(a[i]+ " ");	// a[0]~a[pl-1]
	
		System.out.println();
	
		
		if(pl>pr+1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i=pr+1; i<=pl-1; i++)	//a[p+1]~a[pl-1]
				System.out.print(a[i] + " ");
			System.out.println();	
		}
		
		if(pl > pr +1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i=pr+1; i<=pl-1; i++)	//a[pr+1]~a[pl-1]
				System.out.print(a[i] + " ");
			System.out.println();	
		}
		
		
	
	}

}
