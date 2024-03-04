package Array;

import java.util.Scanner;

public class Testarray {
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

            int arr1[] = new int[n];
            System.out.println("Enter elements one by one: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr1[i] = sc.nextInt();
            }

            int sum[] = new int[n];
            System.out.println("The sum of the two arrays are :");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum[i] = arr[i] + arr1[i];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sum[i]);
                }
            }
        }

    }
}
