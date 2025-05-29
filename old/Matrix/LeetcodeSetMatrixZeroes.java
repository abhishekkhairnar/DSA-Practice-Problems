import java.util.*;
public class LeetcodeSetMatrixZeroes
{
    public static void main(String[]args)
    {
        int[][]arr={{0,2}};
        int n=arr.length;
        setZeroes(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][]arr)
    {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    ArrayList<Integer>list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    a.add(list);
                }
            }
        }
        System.out.println(a);
        int len = a.size();
        for(int i=0;i<len;i++)
        {
            int row = a.get(i).get(0);
            int col = a.get(i).get(1);
            for(int j=0;j<n;j++)
            {
                arr[row][j] = 0;
            }
            for(int k=0;k<n;k++)
            {
                arr[k][col] = 0;
            }
        }
    }
}