package KONG_VONGPISITH_TP02.edu;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Program for counting the number of number of hundreds.");

        System.out.printf("Please input positive number: ");
        x = sc.nextInt();
        y = x / 100;
        System.out.println("There are " + y + " hundred in number " + x);
        sc.close();
    }
}
