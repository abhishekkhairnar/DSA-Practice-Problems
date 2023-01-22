public class SudukuSolverLeetcode{
    public static void main(String[]args){
        
    }
    static boolean helper(char[][]board,int row,int col){
        if(row==board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }
        else{
            ncol = 0;
            nrow = row+1;
        }
        if(board[row][col] != '.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                    if(helper(board,nrow,ncol)){
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        
    }
    static boolean isSafe(char[][]board,int row,int col,int value){
        // row & col
        for(int i=0;i<board.length;i++){
            // col
            if(board[row][i] == (char)(value+'0')){
                return false;
            }
            // row
            if(board[i][col] == (char)(value+'0')){
                return false;
            }
        }
        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<3;i++){
            for(int j=sc;j<3;j++){
                if(board[i][j]==(char)(value+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean helper2(int[][]board,int row,int col){
        if(row==board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }
        else{
            ncol = 0;
            nrow = row+1;
        }
        if(board[row][col] != 0){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col] = i;
                    if(helper(board,nrow,ncol)){
                        return true;
                    }
                    else{
                        board[row][col] = 0;
                    }
                }
            }
        }
    }
    static void display(int[][]board){
        for(int[] row : board){
            for(int element: row){
                System.out.print(element);
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][]board,int row,int col,int value){
        // row & col
        for(int i=0;i<board.length;i++){
            // col
            if(board[row][i] == value){
                return false;
            }
            // row
            if(board[i][col] == value){
                return false;
            }
        }
        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<3;i++){
            for(int j=sc;j<3;j++){
                if(board[i][j]==value){
                    return false;
                }
            }
        }
        return true;
    }
}