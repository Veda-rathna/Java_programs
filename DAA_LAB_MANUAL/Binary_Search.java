package DAA_LAB_MANUAL;

import java.util.Scanner;

public class Binary_Search {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        System.out.println("Enter the desired element to search");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index " + result);
    }

    public static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        
        return -1;

    }
}