package edu;

public class oddEven {
    int num;

    public oddEven(int number) {
        num = number;
    }

    public boolean isOdd() {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    public boolean isEven() {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
