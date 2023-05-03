package easy1000s;

import java.util.Scanner;
import java.util.Arrays;

public class no1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result  = N;
        int cnt = 0;

        while(true){

            int num1 = result % 10; //일의 자리
            int num2 = result / 10; //십의 자리

            if(num1 + num2 >= 10 ) result = (num1  * 10) + (num1+ num2)%10 ;
            else result = (num1 * 10) + (num1 + num2);

            cnt++;

            if (result == N) break;
        }

        System.out.print(cnt);

    }
}
