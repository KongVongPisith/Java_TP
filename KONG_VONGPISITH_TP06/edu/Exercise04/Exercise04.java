package KONG_VONGPISITH_TP06.edu.Exercise04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        course course = new course();
        course.add_course(1, "Software Engerneer");
        course.add_course(2, "Internet Programing");

        while (true) {
            System.out.println();
            System.out.println("course in DICE");
            System.out.println("1. List all course");
            System.out.println("2. Find course by name");
            System.out.println("3. Add new course");
            System.out.println("4. Quit");
            System.out.printf("Choose option: ");
            int op = sc.nextInt();
            System.out.println();
            if (op == 1) {
                course.list_course();
            } else if (op == 2) {
                String find_course;
                System.out.printf("Enter course that you want to search: ");
                find_course = sc.nextLine();
                find_course = sc.nextLine();
                course.find_course(find_course);
            } else if (op == 3) {
                System.out.printf("Input number: ");
                int index = sc.nextInt();
                System.out.printf("Input Subject name: ");
                String String = sc.nextLine();
                String = sc.nextLine();
                course.add_course(index, String);
            } else if (op == 4) {
                break;
            } else {
                System.out.println("Invalid number please input again");
            }
        }
    }
}
