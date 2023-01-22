public class CutTheRope{
    public static void main(String[]args){
        System.out.println(Rope(5,2,1,5));
    }
    public static int Rope(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int result = Math.max(Rope(n-a,a,b,c),Math.max(Rope(n-b,a,b,c),Rope(n-c,a,b,c)));
        if(result == -1){
            return -1;
        }
        else{
            return result+1;
        }
    }
}
// time complexity : O(3^n)