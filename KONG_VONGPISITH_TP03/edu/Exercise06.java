package KONG_VONGPISITH_TP03.edu;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int op;

        do {

            // Scanner sc = new Scanner(System.in);
            // int op;
            System.out.println();
            System.out.println("--------Menu--------");
            System.out.println("1. Seconds to time");
            System.out.println("2. Time to Seconds");
            System.out.println("3. Calling cost");
            System.out.println("4. Riels to Dollar");
            System.out.println("5. Traveling Duration");
            System.out.println("0. Exit");
            System.out.printf("Choose an option: ");
            op = scan.nextInt();
            System.out.println("----------------------------");
            switch (op) {
                case 1: {
                    Exercise01.main(null);
                    break;
                }
                case 2: {
                    Exercise02.main(null);
                    break;
                }
                case 3: {
                    Exercise03.main(null);
                    break;
                }
                case 4: {
                    Exercise04.main(null);
                    break;
                }
                case 5: {
                    Exercise05.main(null);
                    break;
                }
                default: {
                    System.out.println("No option");
                }
            }
        } while (op != 0);
    }
}
