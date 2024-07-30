import java.util.*;

class College {
    String name;
    int rollno;

    void studentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollno);
    }
}

class Courses extends College {
    String courseName;
    int courseFee;
    float totalMarks = 0.00f;

    void courseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Fee: " + courseFee);
    }

    void calculateGPA(int numofsub) {
        float marks = 0.00f;
        int numofarr = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numofsub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks = sc.nextFloat();
            if (marks > 90 && marks <= 100) {
                totalMarks += 10;
            } else if (marks > 80 && marks <= 90) {
                totalMarks += 9;
            } else if (marks > 70 && marks <= 80) {
                totalMarks += 8;
            } else if (marks > 60 && marks <= 70) {
                totalMarks += 7;
            } else {
                totalMarks += 6;
                numofarr += 1;
            }
        }
    }

    void result(int numofsub) {
        float cgpa = totalMarks / numofsub;
        System.out.println("CGPA: " + cgpa);
    }
}

class Enrollment extends Courses {
    String enrollmentID;
    String enrollmentDate;
}

class Main extends Enrollment {
    public static void main(String[] args) {
        Main[] obj = new Main[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            obj[i] = new Main();
            System.out.print("Enter the name of the student: ");
            obj[i].name = sc.nextLine();
            System.out.print("Enter your roll no: ");
            obj[i].rollno = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.print("Enter your course name: ");
            obj[i].courseName = sc.nextLine();
            System.out.print("Enter your course fee: ");
            obj[i].courseFee = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.print("Enter the number of subjects: ");
            int numofsub = sc.nextInt();
            sc.nextLine();
            System.out.println();
            obj[i].calculateGPA(numofsub);
            System.out.println();
            obj[i].studentDetails();
            System.out.println();
            obj[i].courseDetails();
            System.out.println();
            obj[i].result(numofsub);
        }
    }
}
