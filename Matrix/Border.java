public class Border
{
    public static void main(String[]args)
    {
        int[][]matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printBorder(matrix);
    }
    public static void printBorder(int[][]matrix)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        if(n==1)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(matrix[i][n]+" ");
            }
            System.out.println();
        }
        else if(m==1)
        {
            for(int i=0;i<m;i++)
            {
                System.out.print(matrix[m][i]+" ");
            }
            System.out.println();
        }
        else
        {
            for(int i=0;i<m;i++)
                System.out.print(matrix[0][i]+" ");
            for(int i=1;i<n;i++)
                System.out.print(matrix[i][m-1]+" ");
            for(int i=m-2;i>=0;i--)
                System.out.print(matrix[n-1][i]+" ");
            for(int i=n-2;i>0;i--)
                System.out.print(matrix[i][0]+" ");
        }
    }
}