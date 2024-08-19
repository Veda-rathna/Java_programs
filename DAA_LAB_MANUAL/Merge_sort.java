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
    
            int i = 0, j = 0, k = 0;
    
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }
    
            while (i < left.length) {
                array[k++] = left[i++];
            }
    
            while (j < right.length) {
                array[k++] = right[j++];
            }
        }
    }    

    //Testing 
    
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3, 7, 6, 4};
        mergeSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}