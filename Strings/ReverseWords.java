package Strings;

public class ReverseWords{
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(reverse(s));
        
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = n - 1;
        while(i > 0){
            int j=i;
            while(j > 0 && s.charAt(j) != '.') j--;
            if(j==0) sb.append(s.substring(j, i+1));
            else sb.append(s.substring(j+1, i+1)+'.');
            i = j-1;
        }
        System.out.println(s.substring(0, 1));
        return sb.toString();
    }
}