public class GFGNqueen{
    public static void main(String[]args){

    }
    static void helper(boolean[][]board,ArrayList<ArrayList<Integer>> allBoards,int col){
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }
        
        // ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >();
        
        for(int row=0;row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                helper(board,allBoards,col+1)
                board[row][col] = false;//backtrack
            }
        }
        
        
        return aList;
    }
}