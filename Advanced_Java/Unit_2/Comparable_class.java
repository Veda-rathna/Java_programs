package Advanced_Java.Unit_2;

import java.util.*;

class Student implements Comparable<Student> {
        int rollno;
        String name;
        int age;

        Student(int rollno, String name, int age){
            this.age = age;
            this.name = name;
            this.rollno = rollno;
        }

        public int compareTo(Student st){
            if(age == st.age){
                return 0;
            }
            else if(age > st.age){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

    class Test{
        public static void main(String[] args) {
            ArrayList<Student> al = new ArrayList<>();

            al.add(new Student(1001, "Arun", 20));
            al.add(new Student(1002, "Tharun", 19));
            al.add(new Student(1003, "Rahul", 20));

            for(Student st:al){
                System.out.println(st.rollno+" "+st.name+" "+st.age);
            }
        }
    }
