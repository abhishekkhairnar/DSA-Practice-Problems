import java.util.*;
public class Help
{
    public static void main(String[]args)
    {
        List<Integer> list = new ArrayList<Integer>();
        int[]arr = {9,9,9,9,9,9,9,9,9,9};
        long sum=arr[arr.length-1];
        int exp=10;
        for(int i=arr.length-2;i>=0;i--)
        {
            sum += arr[i]*exp;
            exp *= 10;
        }
        System.out.println(sum);
        sum += 1;
        System.out.println(sum);
        list.add((int)sum%10);
        exp=10;
        while(exp<=sum){
            list.add((int)sum/exp%10);
            System.out.println(list);
            exp*=10;
        }
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        System.out.println(list);
    }
}