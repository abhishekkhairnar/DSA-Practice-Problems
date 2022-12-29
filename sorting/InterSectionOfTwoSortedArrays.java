import java.util.Arrays;
public class IntersectionOfTwoSortedArrays
{
    public static void main(String[]args)
    {
        int[]a = {1,2,3,3,4,4,5};
        int[]b = {2,3,4,5,8,9};
        intersection(a,b);
    }
    public static void intersection(int[]a,int[]b)
    {
        int i=0,j=0;
        int m=a.length;
        int n=b.length;
        while(i<m && j<n)
        {
            if(i>0 && a[i-1]==a[i])
            {
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[j])
            {
                j++;
                continue;
            }
            else if(a[i]>b[j])
                j++;
            else if(a[i]<b[j])
                i++;
            else if(a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
}