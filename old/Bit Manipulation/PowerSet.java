// We are given a String and we have to print all of its subsets
public class PowerSet{
    public static void main(String[]args){
        String str = "abc";
        power(str);
    }
    public static void power(String str){
        int n = str.length();
        int powerNo = (1<<n);
        for(int i=0;i<powerNo;i++){
            for(int j=0;j<n;j++){
                int temp = 1<<j;
                if((i&temp)!=0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}