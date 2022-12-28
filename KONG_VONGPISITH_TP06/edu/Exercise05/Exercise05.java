package KONG_VONGPISITH_TP06.edu.Exercise05;

import java.util.Collections;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product products = new Product();

        while (true) {
            System.out.println();
            System.out.println("New Year Gift Shop");
            System.out.println("1. List all Product");
            System.out.println("2. Add new product to list");
            System.out.println("3. Remove product from list");
            System.out.println("4. Update product");
            System.out.println("5. Exit");
            System.out.printf("Choose option: ");
            int op = sc.nextInt();
            System.out.println();
            if (op == 1) {
                if (products.check()) {
                    products.show_product();
                } else {
                    System.out.println("No product exist\n");
                }

            } else if (op == 2) {
                System.out.print("Enter product number: ");
                int product_id = sc.nextInt();
                System.out.print("Enter product name: ");
                String product_name = sc.nextLine();
                product_name = sc.nextLine();
                System.out.printf("Enter product price: ");
                double product_price = sc.nextDouble();
                System.out.printf("Enter amount of product: ");
                int amout_product = sc.nextInt();

                products.add_product(product_id, product_name, product_price, amout_product);

            } else if (op == 3) {
                System.out.print("Enter product ID to delete: ");
                int index_ID = sc.nextInt();
                products.remove_product(index_ID);
                products.show_product();
            } else if (op == 4) {
                if (products.check()) {
                    System.out.print("Enter product to update: ");
                    int id_product = sc.nextInt();
                    System.out.println();
                    System.out.printf("Enter new product's name: ");
                    String name = sc.nextLine();
                    name = sc.nextLine();
                    System.out.printf("Enter new price: ");
                    double price = sc.nextDouble();
                    System.out.printf("Enter new amount of stock: ");
                    int amount_stock = sc.nextInt();
                    products.update_product(id_product, name, price, amount_stock);
                } else {
                    System.out.println("No product exist\n");
                }

            } else if (op == 5) {
                break;
            } else {
                System.out.println("Invalid number please input again");
            }
        }
    }
}
