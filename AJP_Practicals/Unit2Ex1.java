package AJP_Practicals;

//Complex Object with Nested Data Structures.

import java.io.*;
import java.util.*;

class Student implements Serializable {
    private String name;
    private int age;
    private List<String> courses;

    public Student(String name, int age, List<String> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", courses=" + courses + "}";
    }
}

class StudentDatabase implements Serializable {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public byte[] serialize() {
        try (ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
             ObjectOutputStream objStream = new ObjectOutputStream(byteStream)) {
            objStream.writeObject(this);
            return byteStream.toByteArray();
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return null;
        }
    }

    public static StudentDatabase deserialize(byte[] data) {
        try (ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
             ObjectInputStream objStream = new ObjectInputStream(byteStream)) {
            return (StudentDatabase) objStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
            return null;
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}

public class Unit2Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();

        System.out.println("Enter student details (type 'done' when finished):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Split the input into name, age, and courses
            String[] parts = input.split(",", 3);
            String name = parts[0].trim().replace("\"", "");
            int age = Integer.parseInt(parts[1].trim());
            String coursesString = parts[2].trim().replace("\"", "");

            // Split courses by commas
            List<String> courses = Arrays.asList(coursesString.split("\\s*,\\s*"));

            // Create a new student and add to the database
            Student student = new Student(name, age, courses);
            database.addStudent(student);
        }

        // Serialize the data
        System.out.println("Serializing data...");
        byte[] serializedData = database.serialize();

        if (serializedData != null) {
            // Deserialize the data and print student details
            System.out.println("Deserializing data...");
            StudentDatabase deserializedDatabase = StudentDatabase.deserialize(serializedData);

            if (deserializedDatabase != null) {
                for (Student student : deserializedDatabase.getStudents()) {
                    System.out.println(student);
                }
            }
        }
        scanner.close();
    }
}