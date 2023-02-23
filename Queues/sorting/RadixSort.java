
import java.util.Arrays;
import java.util.*;
public class RadixSort
{
    public static void main(String[]args)
    {
        int[]arr={5,4,3,2,6,1,0};
        // int k=5;
        int n=arr.length;
        radixSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[]arr,int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }
        for(int exp=1;max/exp>0;exp*=10)
        {
            countSort(arr,n,exp);
        }
    }
    public static void countSort(int[]arr,int n,int exp)
    {
        int count [] = new int [n];
        int output [] = new int [n];
        for(int i=0;i<n;i++){count[i] = 0;}
        for(int i=0;i<n;i++){count[arr[i]/exp%10]++;}
        for(int i=1;i<n;i++){count[i] += count[i-1];}
        for(int i=n-1;i>=0;i--)
        {
            output[count[arr[i]/exp%10]-1] = arr[i];
            count[arr[i]/exp%10]--;
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = output[i];
        }

    }
}
    