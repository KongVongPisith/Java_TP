package edu;

public class Exercise03 {
    public static void main(String[] args) {
        for (int p = 0; p <= 500; p++) {
            oddEven even = new oddEven(p);
            if (even.isEven()) {
                System.out.printf(p + " ");
            }
        }
    }

}
