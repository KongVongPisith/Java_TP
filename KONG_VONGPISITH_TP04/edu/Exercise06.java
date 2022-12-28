package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kg, l;
        System.out.println("Program to calculate liters of patrol");
        while (true) {
            System.out.printf("Please input weight of goods: ");
            kg = sc.nextFloat();
            if (kg <= 30000) {
                /*
                 * 500kg uses 10L
                 * 10000kg uses 20L
                 * thus 1L = 500kg
                 */
                l = kg / 500;

                System.out.println(kg + "kg Need " + l + " liters.");
                break;
            } else {
                System.out.println("Over weight can't be loaded.");
            }
        }

    }
}
