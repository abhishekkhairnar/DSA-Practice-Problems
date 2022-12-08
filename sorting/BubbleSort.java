import java.util.*;
public class BubbleSort{
    public static void main(String[]args){
        int[]arr = {3,6,1,8,2,9};
        FoptBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Naive solution
    public static void sort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    // slightly optimized
    public static void SoptBubbleSort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    // fully optimized
    public static void FoptBubbleSort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}