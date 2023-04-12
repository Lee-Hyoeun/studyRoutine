package etc;

import java.util.Scanner;

public class no11021_2 {
    public static main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.printf("Case #%d: %d\n", i+1, A + B);
        }

    }
}

