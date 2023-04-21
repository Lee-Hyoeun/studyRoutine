package etc;

import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class no25305 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        //방법 1 내림차순 정렬
        Integer arr[] = new Integer[N];

        for(int i = 0; i< N; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        System.out.println(arr[k-1]);

        
        //방법2 오름차순 정렬
        int arr2[] = new int[N];
        
        for(int i = 0; i< N; i++){
            arr2[i] = sc.nextInt();
        }
        
        Arrays.sort(arr2);

        System.out.println(arr2[N-k]);


    }
}
