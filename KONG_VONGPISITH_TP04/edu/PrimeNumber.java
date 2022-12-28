package KONG_VONGPISITH_TP04.edu;

//import java.net.NetPermission;

public class PrimeNumber {
    private int num;

    PrimeNumber(int n) {
        num = n;
    }

    /**
     * @return
     */
    boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    int getNum() {
        return num;
    }
}
