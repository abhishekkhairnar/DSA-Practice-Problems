import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = new int [] {23, 41, 24, 72, 73, 47, 94, 26}; // 23, 24, 26, 41, 47, 72, 73, 94

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    // time complexity = O(n^2)
    public static void selectionSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                // swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}