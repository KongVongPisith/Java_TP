package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program tell whether leap year or not");
        System.out.printf("Please input year: ");
        int year = sc.nextInt();

        if (year >= 1) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println("Error! year must be at least 1 and more");
        }
    }

}
