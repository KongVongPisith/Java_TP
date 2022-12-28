package KONG_VONGPISITH_TP06.edu.Exercise03;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List_PCs ls_pc = new List_PCs();

        ls_pc.add_PC_List(1, "good");
        ls_pc.add_PC_List(2, "damage");
        ls_pc.add_PC_List(3, "good");
        ls_pc.add_PC_List(4, "good");
        ls_pc.add_PC_List(5, "damage");
        ls_pc.add_PC_List(6, "good");
        ls_pc.add_PC_List(7, "damage");
        ls_pc.add_PC_List(8, "damage");
        ls_pc.add_PC_List(9, "damage");
        ls_pc.add_PC_List(10, "good");
        ls_pc.add_PC_List(11, "good");
        ls_pc.add_PC_List(12, "damage");
        ls_pc.add_PC_List(13, "good");
        ls_pc.add_PC_List(14, "good");
        ls_pc.add_PC_List(15, "good");
        ls_pc.add_PC_List(16, "damage");
        ls_pc.add_PC_List(17, "good");
        ls_pc.add_PC_List(18, "good");
        ls_pc.add_PC_List(19, "good");
        ls_pc.add_PC_List(20, "damage");

        while (true) {
            System.out.println();
            System.out.println("Pc at room 306F");
            System.out.println("1. List all PCs");
            System.out.println("2. List all Damages PCs");
            System.out.println("3. List all good PCs");
            System.out.println("4. Mark a PC as damaged");
            System.out.println("5. Mark a PC as not damage");
            System.out.println("6. Quit");
            System.out.printf("Choose option: ");
            int op = sc.nextInt();
            System.out.println();

            if (op == 1) {
                ls_pc.show_pc();
            } else if (op == 2) {
                ls_pc.isDamage();
            } else if (op == 3) {
                ls_pc.isGood();
            } else if (op == 4) {
                ls_pc.show_pc();
                System.out.println();
                int damage_number;
                System.out.printf("Enter pc ID has gotten damage: ");
                damage_number = sc.nextInt();
                ls_pc.markDamage(damage_number);
                ls_pc.show_pc();
            } else if (op == 5) {
                ls_pc.show_pc();
                System.out.println();
                int good_number;
                System.out.printf("Enter pc ID that got fix: ");
                good_number = sc.nextInt();
                ls_pc.markGood(good_number);
                ls_pc.show_pc();
            } else if (op == 6) {
                break;
            } else {
                System.out.println("Invalid number Please input again");
            }
        }
    }
}
