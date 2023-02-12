package KONG_VONGPISITH_e20190457.Exercise01;

public class Positive {

    public Positive(String num) {
    }

    boolean isNum(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    boolean checkValid(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void positive_number(int n) {
        boolean isReverse = false;
        for (int i = 2; i <= n; i = i + 2) {
            if (!isReverse) {
                System.out.printf("%02d %02d ", i - 1, i);
            } else {
                System.out.printf("%02d %02d ", i, i - 1);
            }
            isReverse = !isReverse;
        }
        for (int i = n; i > 0; i = i - 2) {
            if (i > 1) {
                if (!isReverse) {
                    System.out.printf("%02d %02d ", i - 1, i);
                } else {
                    System.out.printf("%02d %02d ", i, i - 1);
                }
                isReverse = !isReverse;
            }
        }
    }
}
