package edu;

import java.util.Scanner;

public class RangeUtil {
    Scanner sc = new Scanner(System.in);
    private int i;
    private int start_number;
    private int end_number;
    private int step;

    public void input_range() {
        System.out.printf("Input start number: ");
        start_number = sc.nextInt();
        System.out.printf("Input end number: ");
        end_number = sc.nextInt();
        System.out.printf("Input step: ");
        step = sc.nextInt();
    }

    public void range() {
        System.out.print("\nType integer: Range number from " + start_number + " to " + end_number + " : ");
        if (start_number < end_number) {
            for (i = start_number; i <= end_number; i = i + step) {
                System.out.printf("%d ", i);
            }
        } else {
            for (i = start_number; i >= end_number; i = i - step) {
                System.out.printf("%d", i);
            }
        }
    }

    public void convertTostrng() {
        System.out.print("\nType String: Range number from " + start_number + " to " + end_number + " : ");
        if (start_number < end_number) {
            for (i = start_number; i <= end_number; i = i + step) {
                String string_number = " " + i;
                System.out.printf("%s ", string_number);
            }
        } else {
            for (i = start_number; i >= end_number; i = i - step) {
                String string_number = " " + i;
                System.out.printf("%s ", string_number);
            }
        }
    }

}
