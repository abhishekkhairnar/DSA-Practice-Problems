package Strings;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bcd";
        System.out.println(anagram(s1,s2));
    }

    private static boolean anagram(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s2);
        for(int i=0;i<s1.length();i++){
            int result = sb.lastIndexOf(s1.substring(i,i+1));
            sb.setCharAt(i,'*');
            if(result == -1) return false;
        }
        return true;
    }
}
