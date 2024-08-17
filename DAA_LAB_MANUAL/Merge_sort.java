package DAA_LAB_MANUAL;

public class Merge_sort {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            mergeSort(left);
            mergeSort(right);

            for (int i = 0; i < array.length; i++) {
                array[i] = (i < mid) ? (left[i] < right[i - mid] ? left[i] : right[i - mid]) : right[i - mid];
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3, 7, 6, 4};
        mergeSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}