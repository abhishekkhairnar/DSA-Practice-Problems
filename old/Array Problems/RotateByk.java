import java.io.*;
import java.util.*;
class RotateByk {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[]arr){
        int temp=arr[arr.length-1];
        System.out.println(temp);
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}