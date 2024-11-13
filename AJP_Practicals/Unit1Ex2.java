package AJP_Practicals;

//Implement a custom data structure that combines features of a list and a set.

import java.util.ArrayList;
import java.util.Scanner;

public class Unit1Ex2 {

    private ArrayList<String> list;

    // Constructor to initialize the list
    public Unit1Ex2() {
        this.list = new ArrayList<>();
    }

    // Method to add an element, ensuring uniqueness
    public void add(String element) {
        if (!list.contains(element)) {
            list.add(element);
            System.out.println("Added: " + element);
        }
    }

    // Method to remove an element if it exists
    public void remove(String element) {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Removed: " + element);
        } else {
            System.out.println("Element not found: " + element);
        }
    }

    // Method to retrieve an element at a specific index
    public void getElementAt(int index) {
        if (index >= 0 && index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Method to display the contents of the list
    public void display() {
        System.out.println("UniqueList: " + list);
    }

    // Main method to interact with the UniqueList
    public static void main(String[] args) {
        Unit1Ex2 uniqueList = new Unit1Ex2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                uniqueList.display();
                break;
            } else {
                try {
                    // Try to parse the input as an integer for index retrieval
                    int index = Integer.parseInt(input);
                    uniqueList.getElementAt(index);
                } catch (Exception e) {
                    // If parsing fails, treat input as a string
                    uniqueList.add(input);
                }
            }
        }

        scanner.close();
    }
}

