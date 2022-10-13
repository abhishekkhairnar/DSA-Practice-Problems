public class CountNoOfZeros{
    public static void main(String[]args){
        System.out.println(count(2010,0));
    }
    static int count(int n,int c){
        if(n%10 == 0){
            c++;
        }
        return count(n/10,c);
    }
}