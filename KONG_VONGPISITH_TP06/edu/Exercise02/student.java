package KONG_VONGPISITH_TP06.edu.Exercise02;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
    private String student_name;
    private int ID;

    public student() {

    }

    public student(String student_name, int ID) {
        this.student_name = student_name;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return student_name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String student_name) {
        this.student_name = student_name;
    }

    ArrayList<student> student_list = new ArrayList<>();

    public void add_student(String[] name, int[] ID, int index) {
        for (int i = 0; i < index; i++) {
            student_list.add(i, new student(name[i], ID[i]));
        }
    }

    public void remove_student(int id) {
        student_list.removeIf(student -> student.ID == id);
    }

    public void update_info(int id) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        String newName;
        for (student student : student_list) {
            if (student.ID == id) {
                System.out.printf("Enter new ID: ");
                int newID = sc.nextInt();

                System.out.printf("Enter a new name: ");
                newName = sc.nextLine();
                newName = sc.nextLine();

                student_list.set(index, new student(newName, newID));

            } else
                index++;
        }

    }

    public boolean check_list() {
        for (student stu : student_list) {
            if (student_list != null) {
                return true;
            }
        }
        return false;
    }

    public void show_list() {
        if (check_list()) {
            System.out.printf("%-20s %-20s\n\n", "ID", "Student Name");
            for (student student : student_list) {
                System.out.printf("%-20d %-20s \n", student.getID(), student.getName());
            }
        }
    }
}
