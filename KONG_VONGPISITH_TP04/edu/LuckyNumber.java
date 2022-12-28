package KONG_VONGPISITH_TP04.edu;

public class LuckyNumber {
    private int num;

    LuckyNumber(int n) {
        num = n;
    }

    boolean isLucky() {
        int sum_first_3_digits = 0;
        int sum_last_3_digits = 0;
        int first_digits = num / 1000;
        int last_digits = num % 1000;
        int remainder;

        for (int i = 0; i < 6; i++) {
            if (first_digits > 0) {
                remainder = first_digits % 10;
                sum_last_3_digits = sum_last_3_digits + remainder;
                first_digits = first_digits / 10;
            }
            if (last_digits > 0) {
                remainder = last_digits % 10;
                sum_first_3_digits = sum_first_3_digits + remainder;
                last_digits = last_digits / 10;
            }
        }

        if (sum_first_3_digits == sum_last_3_digits) {
            return true;
        } else {
            return false;
        }
    }

    boolean isValid() {
        if (num / 100000 >= 1 && num / 1000000 < 1) {
            return true;
        } else {
            return false;
        }
    }

    int getNum() {
        return num;
    }

}
