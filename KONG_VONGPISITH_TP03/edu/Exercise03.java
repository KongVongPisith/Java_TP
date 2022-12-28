package KONG_VONGPISITH_TP03.edu;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start_h, start_mn, start_s, end_s, end_h, end_mn;
        int total_s1, total_s2, total_time;
        double price;
        int h, mn, s;
        int f = 86400;

        System.out.println("Program for calculating cost of call.");
        System.out.printf("Please input start hours: ");
        start_h = sc.nextInt();
        System.out.printf("Please input start minutes: ");
        start_mn = sc.nextInt();
        System.out.printf("Please input star seconds: ");
        start_s = sc.nextInt();
        System.out.println();
        System.out.printf("Please input end hours: ");
        end_h = sc.nextInt();
        System.out.printf("Please input end minutes: ");
        end_mn = sc.nextInt();
        System.out.printf("Please input end seconds: ");
        end_s = sc.nextInt();

        total_s1 = (start_h * 3600) + (start_mn * 60) + start_s;
        total_s2 = (end_h * 3600) + (end_mn * 60) + end_s;

        if (total_s2 <= total_s1) {
            total_time = (f - total_s1) + total_s2;

            h = total_time / 3600;
            mn = (total_time % 3600) / 60;
            s = (total_time % 60);

            price = (total_time * 0.05) / 60;

            System.out.printf("Total call duration: %d:%d:%d", h, mn, s);
            System.out.printf("\nTotal cost of this call: %f $", price);

        } else {
            total_time = total_s2 - total_s1;
            h = total_time / 3600;
            mn = (total_time % 3600) / 60;
            s = (total_time % 60);
            price = (total_time * 0.05) / 60;
            System.out.printf("Total call duration: %d:%d:%d", h, mn, s);
            System.out.printf("\nTotal cost of this call: %f$", price);
        }
        // sc.close();

    }
}
