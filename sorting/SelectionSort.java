import java.util.*;
public class SelectionSort{
    public static void main(String[]args){
        int[]arr = {2,9,1,8,3,5};
        OptSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    // Naive solution
    public static void sort(int []arr){
        int n = arr.length;
        int[] temp = new int [n];
        int max = 2147483647;
        for(int i=0;i<n;i++){
            int min_idx =0;
            for(int j=0;j<n;j++){
                if(arr[min_idx]>arr[j]){
                    min_idx=j;
                }
            }
            temp[i] = arr[min_idx];
            arr[min_idx] = max;
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
    // Optimized Solution
    // In place selection sort implementation
    // this algorithm is not stable as it swaps the smallest element from array starting from 0th position
    public static void OptSelectionSort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min_idx=i;// here i forgot to update min_idx as i 
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            swap(arr,min_idx,i);
        }
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}