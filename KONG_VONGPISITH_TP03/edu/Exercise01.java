package KONG_VONGPISITH_TP03.edu;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, mn, h, total;

        System.out.printf("Input number of seconds: ");
        total = sc.nextInt();

        h = total / 3600;
        mn = (total % 3600) / 60;
        s = total % 60;

        System.out.printf("Time coresponding to %d seconds is %d:%d:%d", total, h, mn, s);
        // sc.close();
    }
}
