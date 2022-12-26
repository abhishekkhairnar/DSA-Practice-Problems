// We can apply count sort whenever our array elements lie in between 0 to n  where n is the size of array
import java.util.Arrays;
public class CountSort
{
    public static void main(String[]args)
    {
        int[]arr={1,4,4,1,0,1};
        int k=5;
        int n=arr.length;
        countSort(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[]arr,int n,int k)
    {
        int count[] = new int [n];
        for(int i=0;i<n;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        for(int i=1;i<k;i++)
        {
            count[i] += count[i-1];
        }
        int [] output = new int [n];
        for(int i=0;i<n;i++)
        {
            output[count[arr[i]]-1]= arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = output[i];
        }
    }
    public static void naiveCountSort(int[]arr,int n,int k)
    {
        int count [] = new int [n];
        for(int i=0;i<n;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        int idx=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                arr[idx] = i;
                idx++;
            }
        }
    }
}