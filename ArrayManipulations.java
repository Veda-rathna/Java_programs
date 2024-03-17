import java.util.Arrays;

public class ArrayManipulations {

    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void findSubArrayWithSum(int[] arr, int sum) {
        int currentSum = arr[0];
        int start = 0;
        for (int i = 1; i <= arr.length; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == sum) {
                System.out.println("Subarray found between indexes " + start + " and " + (i - 1));
                return;
            }
            if (i < arr.length) {
                currentSum += arr[i];
            }
        }
        System.out.println("No subarray found with the given sum.");
    }

    public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] matrixSubtraction(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }

    public static int findNthDigit(int n) {
        int count = 9;
        int length = 1;
        int start = 1;
        
        while (n > length * count) {
            n -= length * count;
            count *= 10;
            length++;
            start *= 10;
        }

        start += (n - 1) / length;
        String num = Integer.toString(start);
        return Character.getNumericValue(num.charAt((n - 1) % length));
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4, 2, 8, 6, 5};
        int k = 3;
        System.out.println("Kth smallest element: " + findKthSmallest(array, k));

        int[] array2 = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        findSubArrayWithSum(array2, sum);

        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        System.out.println("Matrix Addition:");
        int[][] additionResult = matrixAddition(matrixA, matrixB);
        for (int[] row : additionResult) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Matrix Subtraction:");
        int[][] subtractionResult = matrixSubtraction(matrixA, matrixB);
        for (int[] row : subtractionResult) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Matrix Multiplication:");
        int[][] multiplicationResult = matrixMultiplication(matrixA, matrixB);
        for (int[] row : multiplicationResult) {
            System.out.println(Arrays.toString(row));
        }

        int[] array3 = {1, 2, 4, 2, 3, 1, 4, 5};
        int[] uniqueArray = removeDuplicates(array3);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

        int n = 12;
        System.out.println("The " + n + "th digit is: " + findNthDigit(n));
    }
}
