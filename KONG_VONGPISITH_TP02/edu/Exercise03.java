package KONG_VONGPISITH_TP02.edu;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float x, y, z;

        System.out.println("Program for calculating equation 1/x = 1/y + 1/z");

        System.out.printf("Please input y: ");
        y = sc.nextFloat();
        System.out.printf("Please input z: ");
        z = sc.nextFloat();

        x = (z * y) / (z + y);

        System.out.println("Result x = " + x);
        sc.close();

    }

}
