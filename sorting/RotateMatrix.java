import java.util.Arrays;
public class RotateMatrix
{
    public static void main(String[]args)
    {
        int[][] mat = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        int[][] aux = new int [5][5];
        int n = mat.length;
        rotate(mat,mat.length,aux);
        // System.out.println(Arrays.toString(mat));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(aux[i][j]+"    ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][]mat,int n,int[][]aux)
    {
        for(int i=n-1, k=0 ; i>=0 && k<n ; i--, k++)
        {
            for(int j=0, l=0;j<n && l<n; j++,l++)
            {
                aux[k][l]=mat[j][i];
                // int temp = mat[k][l];
                // mat[k][l] = mat[j][i];
                // mat[j][i] = temp;
                // int temp = mat[j][i];
                // mat[j][i] = mat[k][l];
                // mat[k][l] = mat[j][i];
                // System.out.print(j+" "+i+" with "+k+" "+l+"|");
            }
            System.out.println();
        }
    }
}