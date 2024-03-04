package Class;

class Student{
    int id;
    String name;
    
    Student(){
        System.out.println("Enter the details of the student");
    }

    Student(int i, String n){
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student s1 = new Student(1001,"Ramu");
        Student s2 = new Student(1002,"Somu");
        s1.display();
        s2.display();
    }
}
