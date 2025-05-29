import java.util.*;
public class CountFreq
{
    public static void main(String[]args)
    {
        int arr[] = {2,3,2,6,1,2,4,6,2,1};
        count(arr);
    }
    public static void count(int[]arr)
    {
        int n=arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i]))
                mp.put(arr[i],mp.get(arr[i])+1);
            else
                mp.put(arr[i],1);
        }
        for (Integer i : mp.keySet()) 
        {
            System.out.println("key: " + i + " value: " + mp.get(i));
        }
    }
}