import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 1, 2, 3, 4, 2, 4, 5, 6}; // 23, 24, 26, 41, 47, 72, 73, 94

//        selectionSort(arr);
//        bubbleSort(arr, 10);
//        insertionSort(arr, 10);
//        mergeSort(arr, 0, arr.length - 1);
//        recBubbleSort(arr, 9);
        recInsertionSort(arr, 0);

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
    // time complexity best case O(n) worst case O(n^2)
    public static void insertionSort(int [] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                arr[j] += arr[j - 1];
                arr[j - 1] = arr[j] - arr[j - 1];
                arr[j] -= arr[j - 1];
                j--;
            }
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int index = low;

        int left = low;
        int right = mid + 1;

        ArrayList<Integer> sortedList = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                sortedList.add(arr[left]);
                left++;
            } else {
                sortedList.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            sortedList.add(arr[left]);
            left++;
        }

        while (right <= high) {
            sortedList.add(arr[right]);
            right++;
        }

        for (int i = low; i < high; i++) {
            arr[i] = sortedList.get(i - low);
        }
    }

    // recursive bubble sort
    public static void recBubbleSort(int [] arr, int n) {
        if (n == 1) return;
        for (int j = 0; j < n - 2; j++) {
            if (arr[j] > (arr[j + 1])) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        recBubbleSort(arr, n - 1);
    }

    // recursive insertion sort
    public static void recInsertionSort(int [] arr, int n) {
        if (n == arr.length) return;
        int j = n;
        while (j > 0 && arr[j - 1] > arr[j]) {
            arr[j] += arr[j - 1];
            arr[j - 1] = arr[j] - arr[j - 1];
            arr[j] -= arr[j - 1];
            j--;
        }
        recInsertionSort(arr, n + 1);
    }
}