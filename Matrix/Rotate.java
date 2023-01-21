public class Rotate
{
    public static void main(String[]args)
    {
        int[][]matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n=matrix.length;
        transpose2(matrix);
        reverse(matrix);
        // rotate(matrix);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][]matrix)
    {
        int n=matrix.length;
        int temp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[n-j-1][i] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=temp[i][j];
            }
        }
    }
    public static void transpose2(int[][]matrix)
    {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                swap(matrix,i,j);
            }
        }
    }
    public static void swap(int[][]matrix,int i,int j)
    {
        int temp = matrix[i][j]; 
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void reverse(int[][]matrix)
    {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            int low=0;int high=n-1;
            while(low<high)
            {
                swap(matrix,low,high,i);
                low++;
                high--;
            }
        }
    }
    public static void swap(int[][]matrix,int low,int high,int i)
    {
        int temp = matrix[low][i]; 
        matrix[low][i] = matrix[high][i];
        matrix[high][i] = temp;
    }
}