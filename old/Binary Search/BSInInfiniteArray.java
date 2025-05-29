import java.util.*;
public class BSInInfiniteArray{
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,4,6,8,10,11,13,15,15,17,18};
        int target = 17;
        System.out.println(getIndex(arr,target));
    }

    private static int getIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;
        // double the window
        while(target > arr[end]){
            int newstart = end + 1;
            if(end + (end - start + 1) * 2 > arr.length){
                end = arr.length - 1;
            }else{
                end = end + (end - start + 1) * 2;    
            }
            start = newstart;
        }
    
        return binarySearch(arr,target,start,end);
    }

    private static int binarySearch(int[] arr, int target,int start,int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}