package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The array is created");

            System.out.println("The defined array is:");

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
