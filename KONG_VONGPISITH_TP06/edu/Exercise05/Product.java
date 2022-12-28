package KONG_VONGPISITH_TP06.edu.Exercise05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Product {
    private int product_number;
    private String name;
    private double price;
    private int amount_stock;

    // ArrayList<Product> product = new ArrayList<Product>();
    LinkedList<Product> product = new LinkedList<Product>();
    Scanner sc = new Scanner(System.in);

    public Product() {

    }

    public Product(int product_number, String name, double price, int amount_stock) {
        this.product_number = product_number;
        this.name = name;
        this.price = price;
        this.amount_stock = amount_stock;
    }

    public void add_product(int product_iD, String product_name, double price, int amount_stock) {
        // for (int i = 0; i < index; i++) {
        // product.add(i, new Product(product_iD[i], product_name[i], price[i],
        // amount_stock[i]));
        // }
        product.add(new Product(product_iD, product_name, price, amount_stock));
    }

    public void remove_product(int index) {
        // for (Product pro : product) {
        // if (pro.product_number == index) {
        // product.remove(pro);
        // }
        // }
        product.removeIf(Product -> Product.product_number == index);
    }

    public void update_product(int index, String pro_name, Double pro_price, int pro_stock) {
        int t = 0;
        for (Product pro : product) {
            if (pro.product_number == index) {
                // System.out.printf("Enter new product's name: ");
                // name = sc.nextLine();
                // name = sc.nextLine();
                // System.out.printf("Enter new price: ");
                // price = sc.nextDouble();
                // System.out.printf("Enter new amount of stock: ");
                // amount_stock = sc.nextInt();

                product.set(t, new Product(index, pro_name, pro_price, pro_stock));

            } else {
                t = t + 1;
            }
        }

    }

    int getNumberProduct() {
        return product_number;
    }

    public void setProduct_number(int product_number) {
        this.product_number = product_number;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double getprice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    int getamount() {
        return amount_stock;
    }

    public void setAmount(int amount_stock) {
        this.amount_stock = amount_stock;
    }

    public boolean check() {
        for (Product pro : product) {
            if (product != null) {
                return true;
            }
        }
        return false;
    }

    public void show_product() {
        if (check()) {
            System.out.printf("%-20s %-20s %-20s %-20s \n", "Number", "Name", "Price", "In Stock");
            for (Product pro : product) {

                System.out.printf("%-20d %-20s %-20.2f %-20d\n", pro.getNumberProduct(), pro.getName(),
                        pro.getprice(), pro.getamount());
            }
        }
    }

}
