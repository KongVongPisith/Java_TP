package KONG_VONGPISITH_TP03.edu;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, mn, s, total;

        System.out.println("Program for converting time to second.");

        System.out.printf("Please input hours: ");
        h = sc.nextInt();

        System.out.printf("Please input minutes: ");
        mn = sc.nextInt();

        System.out.printf("Please input seconds: ");
        s = sc.nextInt();

        total = (h * 3600) + (mn * 60) + (s);

        System.out.printf("Number of seconds =  %dx3600 + %dx60 + %d = %d", h, mn, s, total);
        // sc.close();
    }
}
