import java.util.*;
public class PairWithGivenSum
{
    public static void main(String[]args)
    {
        int[]a={3,2,8,13,-8};
        int sum=17;
        System.out.println(pairExists(a,sum));
    }
    public static boolean pairExists(int[]a,int sum)
    {
        HashSet<Integer> set = new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(set.contains( sum - a[i] ))
                return true;
            set.add(a[i]);
        }
        return false;
    }
}