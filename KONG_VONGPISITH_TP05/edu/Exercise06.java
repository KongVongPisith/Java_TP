package edu;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a word: ");
        String st = sc.next();
        String_mirroring sm = new String_mirroring(st);
        System.out.println(sm.makePalindrome());
    }
}
