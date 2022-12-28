package KONG_VONGPISITH_TP06.edu.Exercise04;

import java.util.ArrayList;

public class course {
    private String subject;
    private int No_course;

    public course() {
    }

    public course(int No_course, String subject) {
        this.subject = subject;
        this.No_course = No_course;
    }

    ArrayList<course> course_major = new ArrayList<course>();

    public void add_course(int index, String major) {
        course_major.add(new course(index, major));
    }

    public boolean check_course() {
        for (course c : course_major) {
            if (c.subject != null) {
                return true;
            }
        }
        return false;
    }

    public void find_course(String s) {
        for (course course : course_major) {
            if (course.subject.equals(s)) {
                System.out.printf("%d subject: %s\n", course.No_course, s);
            }
        }
    }

    public void list_course() {
        for (course course : course_major) {
            System.out.printf("%d subject: %s\n", course.No_course, course.subject);
        }
    }
}
