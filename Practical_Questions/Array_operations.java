package Practical_Questions;

import java.util.*;

class Array_operations1 {
    Array_operations1() {
    }

    void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
    }

    void disp(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Array_operations {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Array_operations1 a = new Array_operations1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        a.search(arr, 30);
        a.sort(arr);
        a.disp(arr);
    }
}
