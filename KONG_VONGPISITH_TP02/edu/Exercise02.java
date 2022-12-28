package KONG_VONGPISITH_TP02.edu;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner omg = new Scanner(System.in);

        float width, height, result1, result2;

        System.out.println("Program for calculating perimeter and surface of Rectangle.");
        System.out.printf("Please input width (in meter): ");
        width = omg.nextFloat();
        System.out.printf("\n");
        System.out.printf("Please input height (in meter): ");
        height = omg.nextFloat();
        System.out.printf("\n");

        result1 = (width + height) * 2;
        result2 = width * height;
        System.out.println("Perimeter = ( " + width + " + " + height + ")x2 = " + result1 + " m");
        System.out.println("Surface = ( " + width + " x " + height + ") = " + result2 + " m^2");
        omg.close();
    }
}
