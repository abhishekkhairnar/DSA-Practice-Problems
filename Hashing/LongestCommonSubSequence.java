import java.util.*;
public class LongestCommonSubSequence
{
    public static void main(String[]args)
    {
        int[]a={3,4,1,2,5,8};
        System.out.println(subarray(a));
    }
    public static int subarray(int[]a)
    {
        int n=a.length;
        int curr=1;
        int res=1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) 
            set.add(a[i]);
        for(int i=0;i<n;i++)
        {
            if(set.contains(a[i]-1))
                curr = 1;
            while(set.contains(a[i]+curr))
                curr++;
            res = Math.max(res,curr);
        }
        return res;
    }
}