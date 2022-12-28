package KONG_VONGPISITH_TP02.edu;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Program for quessing your luckiness.");
        System.out.printf("Please input a positive number: ");
        x = sc.nextInt();
        System.out.println("I got " + (x + 1) + ". I am luckier.");
        sc.close();
    }
}
