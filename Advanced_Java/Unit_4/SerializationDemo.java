package Advanced_Java.Unit_4;

import java.io.*;

// Employee class implementing Serializable interface
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;

    // Constructor to initialize Employee
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overriding toString method to print Employee details
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 101);

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(emp);
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        Employee deserializedEmp = null;
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            deserializedEmp = (Employee) in.readObject();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        // Printing deserialized Employee object
        System.out.println("Deserialized Employee: " + deserializedEmp);
    }
}

