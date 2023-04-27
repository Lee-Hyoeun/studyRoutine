package etc;

import java.util.Scanner;

public class no2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int money =0;

        if(num1 == num2){
            if(num2 == num3)  money = 10_000 + num1 * 1_000;
            else money = 1_000 + num1 * 100;
        }
        else if (num1 == num3){
            money = money = 1_000 + num1 * 100;
        }
        else if (num2 == num3){
            money = money = 1_000 + num2 * 100;
        }
        else{
            if(num1 > num2 && num1 >num3) money = num1 * 100;
            else if(num2 > num1 && num2 >num3) money = num2 * 100;
            else money = num3 * 100;
        }

        System.out.println(money);

    }
}
