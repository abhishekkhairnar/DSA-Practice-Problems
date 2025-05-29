import java.util.*;
public class Union
{
    public static void main(String[]args)
    {
        int[]a={5,20,5,15};
        int[]b={15,15,20,10};
        System.out.println(union(a,b));
    }
    public static int union(int[]a,int[]b)
    {
        int m=a.length;
        int n=b.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<m;i++)
        {
            set.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            set.add(b[i]);
        }
        return set.size();
    }
}