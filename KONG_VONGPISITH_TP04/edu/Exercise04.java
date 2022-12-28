package KONG_VONGPISITH_TP04.edu;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        while (true) {
            System.out.println();
            System.out.println("1. Riels to Dollar");
            System.out.println("2.Riels to Thai Baht");
            System.out.println("3.Dollar to Riels");
            System.out.println("4. Dollar to Thai Baht");
            System.out.println("5. Thai baht to Riels");
            System.out.println("6. Exit");
            System.out.printf("Chose an option: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.println();
                System.out.printf("Input Money in Riels: ");
                float riels = sc.nextFloat();
                Float Dollar;
                Dollar = riels / 4000;
                System.out.printf("%.2f RIELS = %.2f USD\n", riels, Dollar);
            } else if (op == 2) {
                System.out.println();
                System.out.printf("Input Money in Riels: ");
                float riels = sc.nextFloat();
                Float Baht;
                Baht = (30 * riels) / 4000;
                System.out.printf("%.2f RIELS = %.2f BAHT\n", riels, Baht);
            } else if (op == 3) {
                System.out.println();
                System.out.printf("Input Money in Dollar: ");
                float dollar = sc.nextFloat();
                float Riels;
                Riels = dollar * 4000;
                System.out.printf("%.2f USD = %.2f RIELS\n", dollar, Riels);
            } else if (op == 4) {
                System.out.println();
                System.out.printf("Input Money in Dollar: ");
                float dollar = sc.nextFloat();
                float Baht;
                Baht = dollar * 30;
                System.out.printf("%.2f USD = %.2f BAHT\n", dollar, Baht);
            } else if (op == 5) {
                System.out.println();
                System.out.printf("Input Money in Thai Baht: ");
                float baht = sc.nextFloat();
                float Riels;
                Riels = (4000 * baht) / 30;
                System.out.printf("%.2f BAHT = %.2f RIELS\n", baht, Riels);
            } else if (op == 6) {
                break;
            } else {
                System.out.println();
                System.out.println("Invalid option! Please input again");
            }
        }
    }
}
