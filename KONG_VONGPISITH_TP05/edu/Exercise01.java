package edu;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Input number to list prime number from 2 to it: ");
        n = sc.nextInt();
        if (n >= 2) {
            for (int i = 0; i < n; i++) {
                if (Prime_number.isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Invalid number, number must be greater than 2");
        }

    }
}