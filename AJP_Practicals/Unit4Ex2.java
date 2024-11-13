package AJP_Practicals;

//Object Serialization

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Person class implementing Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

// Employee class extending Person
class Employee extends Person {
    private static final long serialVersionUID = 1L;
    private String employeeId;
    private String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", department=" + department + ", " + super.toString() + "]";
    }
}

class Unit4Ex2 {

    public static void main(String[] args) {
        List<Object> objects = parseInput();
        serializeAndDeserialize(objects);
    }

    // Method to parse input and create a list of objects
    private static List<Object> parseInput() {
        List<Object> objects = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                String[] parts = line.split(",");

                if (parts.length < 3) {
                    System.err.println("Invalid input format: " + line);
                    continue; // Skip invalid input
                }

                String type = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);

                if ("Employee".equalsIgnoreCase(type) && parts.length >= 4) {
                    String employeeId = parts[3];
                    String department = parts.length > 4 ? parts[4] : null;
                    objects.add(new Employee(name, age, employeeId, department));
                } else {
                    objects.add(new Person(name, age));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return objects;
    }

    // Method to serialize and deserialize the list of objects
    private static void serializeAndDeserialize(List<Object> objects) {
        String filePath = "objects.ser";

        // Serialize objects to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            for (Object obj : objects) {
                oos.writeObject(obj);
            }
            System.out.println("Objects have been serialized to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize objects from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj;
            while ((obj = ois.readObject()) != null) {
                System.out.println("Deserialized Object: " + obj);
            }
        } catch (EOFException e) {
            // End of file reached, normal behavior
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

