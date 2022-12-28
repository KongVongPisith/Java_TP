package KONG_VONGPISITH_TP02.edu;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;

        System.out.printf("Input your name: ");
        name = sc.nextLine();

        System.out.printf("Hello " + name);
        sc.close();
    }
}
