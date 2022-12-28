package edu;

public class Exercise02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 500; i++) {
            oddEven odd = new oddEven(i);
            if (odd.isOdd()) {
                System.out.print(i + " ");
            }
        }
    }
}
