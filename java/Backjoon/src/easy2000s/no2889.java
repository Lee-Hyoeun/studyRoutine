package easy2000s;

import java.util.Scanner;

public class no2889{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        M = M -45;

        if(M < 0){
            if(H <= 0) H = 23;
            else H = H - 1;

            M = 60 + M;
        }
        System.out.printf("%d %d", H, M);


    }
}
