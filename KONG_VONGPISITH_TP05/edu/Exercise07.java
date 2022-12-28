package edu;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a sentence: ");
        String str = sc.nextLine();
        String Replace_Sentence = str.replace("\\n", "(new_line)");
        Replace_Sentence = Replace_Sentence.replace("\\t", "(tab)");
        Replace_Sentence = Replace_Sentence.replace("\\\\", "(slash)");
        Replace_Sentence = Replace_Sentence.replace("//", "(comment_line)");
        Replace_Sentence = Replace_Sentence.replace(":)", "(smile)");
        System.out.println(Replace_Sentence);
    }
}
