import java.util.*;
public class BucketSort
{
    public static void main(String[]args)
    {
        int[]arr={9,2,6,1,4,8,2};
        int k=4;
        bucketSort(arr,k);
        System.out.println(Arrays.toString(arr));
    }   
    public static void bucketSort(int[]arr,int k)
    {
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }
        max++;
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<k;i++)
        {
            bucket.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
        {
            int bi=k*arr[i]/max;
            bucket.get(bi).add(arr[i]);
        }
        for(int i=0;i<k;i++)
        {
            Collections.sort(bucket.get(i));
        }
        int index=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<bucket.get(i).size();j++)
            {
                arr[index++] = bucket.get(i).get(j);
            }
        }
    }
}