package KONG_VONGPISITH_e20190457.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input total buying price: ");
            try {
                double cost = sc.nextDouble();
                Discount dis = new Discount(cost);
                if (cost >= 50) {
                    System.out.print("Input age: ");
                    int age = sc.nextInt();

                    if (cost >= 50 && cost < 100) {
                        if (age <= 60) {
                            dis.discount_price(10);
                        } else if (age > 60) {
                            dis.discount_price(20);
                        }
                    } else if (cost >= 100 && cost < 200) {
                        if (age <= 60) {
                            dis.discount_price(15);
                        } else if (age > 60) {
                            dis.discount_price(25);
                        }
                    } else if (cost >= 200 && cost < 350) {
                        if (age <= 60) {
                            dis.discount_price(20);
                        } else if (age > 60) {
                            dis.discount_price(30);
                        }
                    } else if (cost >= 350 && cost < 500) {
                        if (age <= 60) {
                            dis.discount_price(25);
                        } else if (age > 60) {
                            dis.discount_price(35);
                        }
                    } else if (cost >= 500) {
                        if (age <= 60) {
                            dis.discount_price(30);
                        } else if (age > 60) {
                            dis.discount_price(40);
                        }
                    }
                } else if (cost > 0 && cost < 50) {
                    System.out.println("\n\n     Total cost: " + cost + " $");
                    System.out.println(" Total discount: 0.00 $");
                    System.out.println("--------------------------");
                    System.out.println("Total payment: " + cost + " $");
                } else {
                    System.out.println("Cost must be positive.\n");
                    Exercise02.main(args);
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! please input again.\n");
                Exercise02.main(args);
                System.out.println();
            }
            System.out.println();
        }
    }
}
