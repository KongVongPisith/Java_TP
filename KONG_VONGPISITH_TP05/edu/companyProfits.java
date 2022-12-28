package edu;

import java.util.Scanner;

public class companyProfits {
    private double[] profit = new double[500];

    public void input_profits() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.printf("Profits for month %d: ", i + 1);
            profit[i] = sc.nextDouble();
        }
    }

    public void display_profit() {
        int i;
        double sum = 0;
        for (i = 0; i < 12; i++) {
            sum = sum + profit[i];
        }
        System.out.println("Total profits for 12 month : " + sum);
    }
}
