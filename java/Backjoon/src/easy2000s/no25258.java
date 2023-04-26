package easy2000s;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int n = sc.nextInt();

        int min = h * 60 + m + n;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.printf("%d %d",hour , minute);

    }
}
