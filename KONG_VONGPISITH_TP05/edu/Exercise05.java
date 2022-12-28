package edu;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please give a word to check: ");
        String s = sc.nextLine();
        palindrome p1 = new palindrome(s);

        System.out.printf("Choose method (REV, LOOP): ");
        String method = sc.nextLine();
        boolean b1 = false;
        if (method.equals("REV"))
            b1 = p1.isRev();
        else if (method.equals("LOOP"))
            b1 = p1.isLoop();

        if (b1 == true) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is not a Palindrome");
        }
    }
}
