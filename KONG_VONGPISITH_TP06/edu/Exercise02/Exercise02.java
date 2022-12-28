package KONG_VONGPISITH_TP06.edu.Exercise02;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student Student = new student();

        while (true) {
            System.out.println();
            System.out.println("Student in Department DICE");
            System.out.println("1. Add new student");
            System.out.println("2. List students");
            System.out.println("3. Remove student by name");
            System.out.println("4. Update student information by id");
            System.out.println("5. Quit");
            System.out.printf("Choose option: ");
            int op = sc.nextInt();
            System.out.println();

            if (op == 1) {

                System.out.printf("Input number student that gonna add: ");
                int index = sc.nextInt();
                int[] id = new int[index];
                String[] name = new String[index];
                for (int i = 0; i < index; i++) {
                    System.out.printf("Input student %d name: ", i + 1);
                    name[i] = sc.nextLine();
                    name[i] = sc.nextLine();
                    System.out.printf("Input student %d ID: ", i + 1);
                    id[i] = sc.nextInt();
                    System.out.println();
                }
                Student.add_student(name, id, index);
            } else if (op == 2) {
                if (Student.check_list()) {
                    Student.show_list();
                } else {
                    System.out.println("No student on the list");
                }

            } else if (op == 3) {
                Student.show_list();
                System.out.println();
                System.out.printf("Enter student ID to remove: ");
                int remove_ID = sc.nextInt();
                Student.remove_student(remove_ID);

            } else if (op == 4) {
                System.out.println();
                System.out.printf("Enter student ID to update information: ");
                int Update_ID = sc.nextInt();
                Student.update_info(Update_ID);
            } else if (op == 5) {
                break;
            } else {
                System.out.println("Invalid number please input again");
            }
        }
    }
}
