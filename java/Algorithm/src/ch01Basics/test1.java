package ch01Basics;

public class test1 {
	public static void main(String[] args){
		
		int i, j;
		int [][]a = {{1,2},{3,4}};
		int [][]b = {{1,2},{3,4}};
		int [][]c = new int[2][2];
		
		for(i=0; i<2; i++) {
			for(j=0; j<2; j++) {
				c[i][j] = a[i][j]+b[i][j];
				
				System.out.println(c[i][j]);

			}
		}
		
//		for(i=0; i<2; i++) {
//			for(j=0; j<2; j++) {
//				System.out.println(c[i][j]);
//			}
//		}

		
	}

}
