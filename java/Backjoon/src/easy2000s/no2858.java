package easy2000s;

import java.util.Scanner;

public class no2858 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int Bn = scan.nextInt(); 
		int Rn = scan.nextInt();
		
		
		int sum = Bn + Rn;
		//주어진 값에 합을 구함
		
		int H = 3;
		int W = 3;
		//초기값 설정
		//빨간 타일이 하나만 있는 바닥 설정
		//해당 값보다 작을시 빨간타일이 없음
		
		
		if(sum < 9) {
			System.out.println(-1);
			//9보다 작으면 빨간타일 없음
		}else {
			while(sum != H * W || sum > H * W ) {
				if(sum > H * W) {
					if(H == W) {
						H++;
					}else {
						W++;
					}
				}
			}
			//항상 열의 값이 크기 때문에 우선적으로 열 값을 증가시킴
			//열값이 클경우에는 다음에는 행 값을 더해주면서 비교
			//sum 값가 같아지거나 커지면 반복문 탈출
			
			if(sum == H * W) {
				System.out.println(H + " " + W);
			}else {
				System.out.println(-1);
			}
			//값 체크 후 같으면 출력
			//다르면 -1
			
			
		}

	}
}
