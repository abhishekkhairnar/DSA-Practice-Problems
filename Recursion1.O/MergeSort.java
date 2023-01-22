import java.util.*;
public class MergeSort{
    public static void main(String[]args){
        int[]arr = {3,5,9,2,7,8,2,4,1};
        int[]ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[]arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[]left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[]first,int[]second){
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // what if still elements of any of array are remaining to insert into mix array
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix; 
    }
}