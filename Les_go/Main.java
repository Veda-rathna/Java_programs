package Les_go;

import java.util.*;

// Implement Student info. class student, course and grade. Use arr to store
// student records and method to calc GPA.

class Student {
    String name;
    int age;
    String reg_no;

    Student() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Registration Number: ");
        reg_no = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
    }

    void disp_student() {
        System.out.println("\nName : " + name);
        System.out.println("Reg No : " + reg_no);
        System.out.println("Age: " + age + "\n");
    }
}

class Course {
    String code, title;
    float marks;

    Course() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Course Code: ");
        code = sc.next();
        System.out.print("Enter Course Title: ");
        sc.nextLine();
        title = sc.nextLine();
    }

    void disp_course() {
        System.out.println("\nCourse Code : " + code);
        System.out.println("Course Title : " + title);
    }
}

class Grade extends Course {
    int m[] = new int[5];
    int grade, no_of_arrear;

    Grade() {
        super();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            m[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (m[i] >= 90)
                grade += 10;
            else if (m[i] >= 80 && m[i] < 90)
                grade += 9;
            else if (m[i] >= 70 && m[i] < 80)
                grade += 8;
            else if (m[i] >= 60 && m[i] < 70)
                grade += 7;
            else if (m[i] >= 50 && m[i] < 60)
                grade += 6;
            else if (m[i] >= 40 && m[i] < 50) {
                grade += 5;
                no_of_arrear += 1;
            } else if (m[i] >= 30 && m[i] < 40) {
                grade += 4;
                no_of_arrear += 1;
            } else if (m[i] >= 20 && m[i] < 30) {
                grade += 3;
                no_of_arrear += 1;
            } else if (m[i] >= 10 && m[i] < 20) {
                grade += 2;
                no_of_arrear += 1;
            } else {
                grade += 1;
                no_of_arrear += 1;
            }
        }
    }

    void displayGrade() {
        System.out.println("\nGrade : " + grade / 6.0);
        System.out.println("Number of arrears : " + no_of_arrear);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Grade student1 = new Grade();
        student.disp_student();
        student1.disp_course();
        student1.displayGrade();
    }
}