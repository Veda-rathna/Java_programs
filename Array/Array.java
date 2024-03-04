package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements one by one: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }

}