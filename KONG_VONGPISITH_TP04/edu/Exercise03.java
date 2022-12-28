package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program for a reversing 4 digits number.");
        System.out.printf("Please input 4 digits number: ");
        int n = sc.nextInt();

        if (n / 1000 >= 1 && n / 10000 < 1) {
            int remainder, reverse = 0;
            while (n != 0) {
                remainder = n % 10;
                reverse = reverse * 10 + remainder;
                n = n / 10;
            }
            System.out.println("After reverse: " + reverse);
        } else {
            System.out.println("Error invalid number, please input only 4 digits number.");
        }
    }
}
