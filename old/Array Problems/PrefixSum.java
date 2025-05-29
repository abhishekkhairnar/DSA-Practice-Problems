import java.io.*;
import java.util.*;

public class PrefixSum{
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getSum(arr,1,3));
    }
    public static int getSum(int[]arr,int left,int right){
        // first of all we will generate prefix sum array
        int Prefix[];
        Prefix = new int [arr.length];
        Prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            Prefix[i] = Prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(Prefix));
        if(left==0){
            return Prefix[right];
        }
        else 
        {
            return Prefix[right] - Prefix[left-1];
        }
    }
}