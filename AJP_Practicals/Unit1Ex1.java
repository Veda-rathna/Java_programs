package AJP_Practicals;

//Basic Operations On Different Data Structures Arraylist,Linkedlist, Hashset And Treeset.

import java.util.*;

public class Unit1Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            List<Integer> elements = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                elements.add(scanner.nextInt());
            }

            System.out.println("Testing with size: " + size);
            System.out.println("Enter " + size + " integers:");

            // ArrayList operations
            testDataStructure(new ArrayList<>(elements), elements, "ArrayList");

            // LinkedList operations
            testDataStructure(new LinkedList<>(elements), elements, "LinkedList");

            // HashSet operations
            testDataStructure(new HashSet<>(elements), elements, "HashSet");

            // TreeSet operations
            testDataStructure(new TreeSet<>(elements), elements, "TreeSet");
        }

        scanner.close();
    }

    private static void testDataStructure(Collection<Integer> dataStructure, List<Integer> elements, String type) {
        System.out.println(type + ":");

        // Inserting elements
        dataStructure.clear();
        dataStructure.addAll(elements);
        System.out.println("Inserting elements:");
        System.out.println(dataStructure);

        // Searching elements
        System.out.println("Searching elements:");
        for (Integer element : elements) {
            if (dataStructure.contains(element)) {
                System.out.println(element + " found");
            } else {
                System.out.println(element + " not found");
            }
        }

        // Deleting elements
        dataStructure.clear();
        System.out.println("Deleting elements:");
        System.out.println(dataStructure);
    }
}
