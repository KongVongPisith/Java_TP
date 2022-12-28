package edu;

import java.util.Scanner;

public class MessageCoder {
    Scanner sc = new Scanner(System.in);
    private String message;

    public void input_message() {
        System.out.printf("Input message: ");
        message = sc.nextLine();
    }

    public void encoder() {
        String removeSpecialCharacters = message.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println("Text message: ");
        System.out.printf("%s\n\n", removeSpecialCharacters);

    }

    public void decoderToString() {
        System.out.println("The original message: ");
        System.out.println(message);
    }
}
