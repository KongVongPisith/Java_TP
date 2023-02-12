package KONG_VONGPISITH_e20190457.Exercise01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input a positive number: ");
            String num = sc.nextLine();

            Positive ps = new Positive(num);

            if (ps.isNum(num)) {
                int n = Integer.valueOf(num);
                if (ps.checkValid(n)) {
                    ps.positive_number(n);
                    break;
                }
            } else {
                System.out.print("Input only positive number: ");
                String num1 = sc.nextLine();
                Positive ps1 = new Positive(num1);
                if (ps.isNum(num)) {
                    int n1 = Integer.valueOf(num);
                    if (ps.checkValid(n1)) {
                        ps.positive_number(n1);
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}