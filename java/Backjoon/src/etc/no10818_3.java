package etc;

import java.util.Scanner;
import java.util.Arrays;

public class no10818_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
		
        //오름차순 정렬
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}
