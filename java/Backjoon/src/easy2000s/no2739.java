package easy2000s;

import java.util.Scanner;

public class no2739{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i =1; i<10; i++){
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }
}
