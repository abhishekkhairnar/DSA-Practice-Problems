public class NoOfIslands{
    public static void main(String[] args) {
        char grid[][] = {
            
        };
    }
    public int numIslands(char[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        boolean visited[][] = new boolean[ROW][COL];
        int count=0;
        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                if(!visited[i][j]){
                    dfs(grid,ROW,COL,i,j);
                    ++count;
                }
            }
        }
        return count;
    }
    static void dfs(char[][] grid,int ROW,int COL,int i,int j){ // i is col & j is row
        if(i < 0 || j < 0 || i > (ROW-1) ||j > (COL-1) || grid[ROW][COL] != '1') return;
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
            dfs(grid,ROW,COL,i+1,j);// right traversal
            dfs(grid,ROW,COL,i-1,j);// left traversal
            dfs(grid,ROW,COL,i,j+1);// upward traversal
            dfs(grid,ROW,COL,i,j-1);// downward traversal
            dfs(grid,ROW,COL,i+1,j+1);// upward right traversal
            dfs(grid,ROW,COL,i-1,j-1);// downward left traversal
            dfs(grid,ROW,COL,i+1,j-1);// downward right traversal
            dfs(grid,ROW,COL,i-1,j+1);// downward right traversal
        }
    }
}