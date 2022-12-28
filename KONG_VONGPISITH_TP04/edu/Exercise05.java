package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.printf("Input number: ");
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < 8; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
