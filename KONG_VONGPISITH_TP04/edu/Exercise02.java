package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for testing lucky number.");
        System.out.printf("Please input 6 digits number: ");
        LuckyNumber ln = new LuckyNumber(sc.nextInt());
        if (ln.isValid()) {
            if (ln.isLucky()) {
                System.out.println(ln.getNum() + " is lucky number.");
            } else {
                System.out.println(ln.getNum() + " is not lucky number.");
            }
        } else {
            System.out.println("Invalid number, input only 6 digits number.");
        }
    }
}