package KONG_VONGPISITH_TP03.edu;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, p;
        int h, mn, s;

        System.out.println("Program for calculating duration of travel from ITC to Airport.");
        System.out.printf("Please input traffic jam factor (in percentage [0-100]): ");
        p = sc.nextInt();

        t = (700 * 3600) / (30 * p);

        h = t / 3600;
        mn = (t % 3600) / 60;
        s = t % 60;

        System.out.printf("Travelling Duration = %d:%d:%d", h, mn, s);

        // sc.close();

    }
}
