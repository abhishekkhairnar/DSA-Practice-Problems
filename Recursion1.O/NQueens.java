import java.util.*;
public class NQueens{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of board : " );
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        int ans = queens(board,0);
        System.out.println("Number of Ways are : "+ans);
    }

    static int queens(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        // placing the queen and checking for every row and column
        int count=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+=queens(board,row+1);
                board[row][col] = false;//backtrack
            }
        }
        return count;
    } 
    static boolean isSafe(boolean[][] board,int row,int col){
        // checking vertically
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        // left diagonal
        int leftmax = Math.min(row,col);
        for(int i=1;i<=leftmax;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        // right diagonal
        int rightmax = Math.min(row,board.length - col - 1);
        for(int i=1;i<=rightmax;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        // if all of the above returns nothing means place is safe so return true finally
        return true;
    }
    //display function
    static void display(boolean[][]board){
        for(boolean[] row : board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static ArrayList<ArrayList<Integer>> queensRet(boolean[][]board,int row){
        if(row == board.length){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    if(board[j][i]){
                        ans.add(j+1);
                    }
                }
            }
            ArrayList<ArrayList<Integer> > List = new ArrayList<ArrayList<Integer> >();
            List.add(ans);
            return List;
        }
        
        ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >();
        
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                aList.addAll(queensRet(board,row+1));
                board[row][col] = false;//backtrack
            }
        }
        
        return aList;
    } 



    static List<List<String>> queensRetString(boolean[][]board,int row){
        if(row == board.length){
            List<String> ans = new ArrayList<>();
            String temp = "";
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    if(board[j][i]){
                        temp = temp+"Q";
                    }
                    else{
                        temp +=".";
                    }
                }
                ans.add(temp);
                temp = "";
            }
            List<List<String> > List = new ArrayList<List<String> >();
            List.add(ans);
            return List;
        }
        
        List<List<String> > aList = new ArrayList<List<String> >();
        
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                aList.addAll(queensRetString(board,row+1));
                board[row][col] = false;//backtrack
            }
        }
        
        return aList;
    }
}