package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input number to check whether it is prime number: ");

        PrimeNumber pn = new PrimeNumber(sc.nextInt());
        if (pn.isPrime()) {
            System.out.println(pn.getNum() + " is Prime number");
        } else {
            System.out.println(pn.getNum() + " is not Prime Number");
        }
    }
}
