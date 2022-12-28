package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        while (true) {
            System.out.println("-------- Menu --------");
            System.out.println("1. Prime number");
            System.out.println("2. Lucky number");
            System.out.println("3. Reversing number");
            System.out.println("4. Money exchange");
            System.out.println("5. Max among 8 number");
            System.out.println("6. Shipping");
            System.out.println("7. leap year");
            System.out.println("0. Exit");
            System.out.printf("Choose an option: ");
            op = sc.nextInt();
            System.out.println("----------------------");

            if (op == 1) {
                System.out.println();
                TP04.Prime_Number();
                System.out.println();
            } else if (op == 2) {
                System.out.println();
                TP04.Lucky_Number();
                System.out.println();
            } else if (op == 3) {
                System.out.println();
                TP04.Resersing_Number();
                System.out.println();
            } else if (op == 4) {
                System.out.println();
                TP04.Money_Exchange();
                System.out.println();
            } else if (op == 5) {
                System.out.println();
                TP04.Max_among_8_number();
                System.out.println();
            } else if (op == 6) {
                System.out.println();
                TP04.Shipping();
                System.out.println();
            } else if (op == 7) {
                System.out.println();
                TP04.Leap_year();
                System.out.println();
            } else if (op == 0) {
                break;
            } else {
                System.out.println();
                System.out.println("Invalid number! Please try again");
                System.out.println();
            }
        }
    }
}
