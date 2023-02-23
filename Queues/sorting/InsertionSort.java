import java.util.Arrays;
public class InsertionSort{
    public static void main(String[]args){
        int[]arr={3,6,1,9,2,8,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Insertion sort algorithm is a simple sorting algorithm like bubble sort and quick sort and it beats merge sort and heap sort in case where size of array is less it performs best when size of array is less
    public static void sort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}