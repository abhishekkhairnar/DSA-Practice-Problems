import java.text.StringCharacterIterator;

public class GCDOfStrings {
    public static void main(String[] args) {
        String s1 = "LEET";
        String s2 = "CODE";
        System.out.println(gcdOfStrings(s1,s2));
        // System.out.println(gcdOfNumber(6, 3));
    }

    private static String gcdOfStrings(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        String str1 = s1+s2;
        String str2 = s2+s1; 
        if(str1.equals(str2)){
            System.out.println(s1+s2);
            System.out.println(s2+s1);
            return "";
        }
        else
            return s1.substring(0, gcdOfNumber(s2.length(), s1.length()));
    }
    private static int gcdOfNumber(int i,int j){
        int gcd = 1;
        int min = Math.min(i,j);
        int max = Math.max(i,j);
        for(int k=2;k<=min;k++){
            if(max % k == 0 && min % k == 0){
                gcd = k;
            }
        }
        return gcd;
    }
    
}
