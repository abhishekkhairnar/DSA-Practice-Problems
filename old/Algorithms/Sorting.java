import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int [] arr = new int [] {9, 88, 0, 1, 2, 3, 4, 5, 6, 7}; // 23, 24, 26, 41, 47, 72, 73, 94

//        selectionSort(arr);
        bubbleSort(arr, 10);

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
    // time complexity: O(n^2)
    public static void bubbleSort(int [] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > (arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}