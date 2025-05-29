public class Transpose
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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][]matrix)
    {
        int n=matrix.length;
        int temp[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j]=matrix[j][i];
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
}