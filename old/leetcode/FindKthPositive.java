import java.util.*;
public class FindKthPositive {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        int k = 2;
        find(arr,k);
    }    
    public static int find(int[]arr,int k)
    {
        int pt1=0;
        int pt2=0;
        int []temp = new int[1000];
        int value=1;
        while(pt2 < 1000)
        {
            if(pt1 <arr.length && arr[pt1]==value)
            {
                value++;
                pt1++;
            }
            else
            {
                temp[pt2] = value;
                value++;
                pt2++;
            }
        }
        System.out.println(Arrays.toString(temp));
        return temp[k];
    }
}
    