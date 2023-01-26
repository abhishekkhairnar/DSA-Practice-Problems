import java.util.*;
public class SubArrayWith0Sum
{
    public static void main(String[]args)
    {
        int[]a={0,1,0,0,0,0};
        int[]b={1,0,0,1,0,1};
        System.out.println(common(a,b));
    }
    public static boolean subArray(int[]a)
    {
        HashSet<Integer> set = new HashSet<>();
        int presum=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            presum += a[i];
            if(set.contains(presum))
                return true;
            if(presum == 0)
                return true;
            set.add(presum);
        }
        return false;
    }
    public static boolean subArrayWithGivenSum(int[]a,int sum)
    {
        HashSet<Integer> set = new HashSet<>();
        int n=a.length;
        int presum=0;
        for(int i=0;i<n;i++)
        {
            presum += a[i];
            if(presum == sum) // corner case
                return true;
            if(set.contains(sum - a[i]))
                return true;
            set.add(presum);
        }
        return false;
    }
    public static int longestSubArrayWithGivenSum(int[]a,int sum)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=a.length;
        int presum=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            presum += a[i];
            if(presum == sum)
                res = i+1;
            if(map.containsKey(presum) == false)
                map.put(presum,i);
            if(map.containsKey(presum - sum))
                res = Math.max(res,i- map.get(presum - sum));
        }
        return res;
    }
    // longest subArray with equal no of 0s and 1s
    public static int equal(int[]a)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=a.length;
        int presum=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            presum += a[i];
            if(presum == 0)
                res = i+1;
            if(map.containsKey(presum) == false)
                map.put(presum,i);
            if(map.containsKey(presum))
                res = Math.max(res,i- map.get(presum)+1);
        }
        return res;
    }
    // longest common subarray with same sum in two binary arrays
    public static int common(int a[],int b[])
    {
        int n = a.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i] = a[i]-b[i];
        }
        return equal(temp);
    }
}