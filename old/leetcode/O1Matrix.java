import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class O1Matrix {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
            {0,0,0},
            {0,1,0},
            {1,1,1}
        };
        int[][]ans = O1Mat(mat);
        print(ans);
    }

    private static void print(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] O1Mat(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[row][col];
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j] == 0){
                    queue.add(new int[]{i,j});
                }else{
                    ans[i][j] = -1;
                }
            }
        }
        // print queue
        // for(int[] a : queue){
        //     System.out.print(a[0]+" "+a[1]);
        //     System.out.println();
        // }
        while(!queue.isEmpty())
        {
            int[]arr=queue.poll();
            int i=arr[0];
            int j=arr[1];

            if(isValid(i+1,j,row,col) && ans[i+1][j] == -1){
                // System.out.println("here");
                queue.add(new int[]{i+1,j});
                ans[i+1][j] = ans[i][j] + 1;
            }
            if(isValid(i-1,j,row,col) && ans[i-1][j] == -1){
                queue.add(new int[]{i-1,j});
                ans[i-1][j] = ans[i][j] + 1;
            }
            if(isValid(i,j+1,row,col) && ans[i][j+1] == -1){
                queue.add(new int[]{i,j+1});
                ans[i][j+1] = ans[i][j] + 1;
            }
            if(isValid(i,j-1,row,col) && ans[i][j-1] == -1){
                queue.add(new int[]{i,j-1});
                ans[i][j-1] = ans[i][j] + 1;
            }
            // queue.poll();
        }
        return ans;
    }

    private static boolean isValid(int i, int j, int row, int col) {
        if(i<0 || j<0 || i>=row || j>=col) return false;
        return true;
    }

    
}
