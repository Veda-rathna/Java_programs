package AJP_Practicals;

//Implement A java Program To Do File Operations

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unit2Ex3 {

    private static List<String> database = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create (Insert)");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Insert operation
                    System.out.print("Enter data to insert: ");
                    String dataToInsert = scanner.nextLine();
                    insertRecord(dataToInsert);
                    break;
                case 2:
                    // Update operation
                    System.out.print("Enter new data to update the first record: ");
                    String newData = scanner.nextLine();
                    updateRecord(newData);
                    break;
                case 3:
                    // Delete operation
                    deleteRecord();
                    break;
                case 0:
                    // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void insertRecord(String data) {
        database.add(data);
        System.out.println("Inserted data: " + data);
    }

    private static void updateRecord(String newData) {
        if (database.isEmpty()) {
            System.out.println("Database is empty. No records to update.");
            return;
        }
        String oldData = database.get(0);  // Assuming updating the first record
        database.set(0, newData);
        System.out.println("Updated data from \"" + oldData + "\" to \"" + newData + "\"");
    }

    private static void deleteRecord() {
        if (database.isEmpty()) {
            System.out.println("Database is empty. No records to delete.");
            return;
        }
        String deletedData = database.remove(0);  // Assuming deleting the first record
        System.out.println("Deleted data: " + deletedData);
    }
}

