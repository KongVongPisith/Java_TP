package KONG_VONGPISITH_TP03.edu;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float riels;
        float dollar;

        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.printf("Please input money in Riels: ");
        riels = sc.nextFloat();

        dollar = (riels / 4000);

        System.out.printf("%.0f RIELS = %.2f USD", riels, dollar);
        // sc.close();

    }
}
