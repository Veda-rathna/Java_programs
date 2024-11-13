package AJP_Practicals;

//A Java program to create a HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unit1Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        // Step 1: Add 5 key-value pairs to the map
        System.out.println("Enter 5 key-value pairs (String and Integer):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            System.out.print("Enter value: ");
            int value = Integer.parseInt(scanner.nextLine());
            map.put(key, value);
        }

        // Step 2: Print all key-value pairs in the map
        System.out.println("\nInitial map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Step 3: Remove an entry by key
        System.out.print("\nEnter a key to remove: ");
        String keyToRemove = scanner.nextLine();
        if (map.containsKey(keyToRemove)) {
            map.remove(keyToRemove);
            System.out.println("Map after removing " + keyToRemove + ":");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } else {
            System.out.println("The key '" + keyToRemove + "' does not exist in the map.");
        }

        // Step 4: Update the value associated with a specific key
        System.out.print("\nEnter a key to update: ");
        String keyToUpdate = scanner.nextLine();
        System.out.print("Enter new value: ");
        int newValue = Integer.parseInt(scanner.nextLine());
        if (map.containsKey(keyToUpdate)) {
            map.put(keyToUpdate, newValue);
            System.out.println("Map after updating " + keyToUpdate + ":");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } else {
            System.out.println("The key '" + keyToUpdate + "' does not exist in the map.");
        }

        // Step 5: Check if the map contains a specific key
        System.out.print("\nEnter a key to check if it exists: ");
        String keyToCheck = scanner.nextLine();
        if (map.containsKey(keyToCheck)) {
            System.out.println("The map contains the key '" + keyToCheck + "'.");
        } else {
            System.out.println("The map does not contain the key '" + keyToCheck + "'.");
        }

        // Step 6: Check if the map contains a specific value
        System.out.print("Enter a value to check if it exists: ");
        int valueToCheck = Integer.parseInt(scanner.nextLine());
        if (map.containsValue(valueToCheck)) {
            System.out.println("The map contains the value " + valueToCheck + ".");
        } else {
            System.out.println("The map does not contain the value " + valueToCheck + ".");
        }

        scanner.close();
    }
}
