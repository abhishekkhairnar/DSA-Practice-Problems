// We can apply count sort whenever our array elements lie in between 0 to n  where n is the size of array
import java.util.Arrays;
public class CountSort
{
    public static void main(String[]args)
    {
        int[]arr={1,4,4,1,0,1};
        int k=5;
        int n=arr.length;
        naiveCountSort(arr,n,k);
        System.out.println(Arrays.toString(arr));
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