public class MazeProblem{
    public static void main(String[]args){
        // System.out.println(mazecount(3,3));
        printmaze("",3,3);
    }
    static int mazecount(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = mazecount(r-1,c);
        int right = mazecount(r,c-1);
        return left+right;
    }
    static void printmaze(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printmaze(p+'D',r-1,c);
        }
        if(c>1){
            printmaze(p+'R',r,c-1);
        }
    }
}