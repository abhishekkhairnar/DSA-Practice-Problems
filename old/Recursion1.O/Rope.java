public class Rope{
    public static void main(String[]args){
        System.out.println(maxNoOfRope(23,11,9,12));
    }
    // Problem Statement -
    // Given a rope of length n, you need to find  maximum number of pieces you can make such that length of every piece is in set {a,b,c} for given input three values a,b & c
    public static int maxNoOfRope(int n,int a,int b,int c){
        if(n==0)return 0;
        if(n<0)return -1;
        int res = Math.max((Math.max(maxNoOfRope(n-a,a,b,c),maxNoOfRope(n-b,a,b,c))),maxNoOfRope(n-c,a,b,c));
        if(res==-1){
            return -1;
        }
        return res;
    }
}