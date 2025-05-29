import java.util.*;
public class Premutations{
    public static void main(String[]args){
        // ArrayList<String> ans = permutations2("","abc");
        // System.out.println(ans);
        System.out.println();
        permutations2("","abcd");
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i <= p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            permutations(s+ch+e,up.substring(1));
        }
    }
    // returning arraylist
    static ArrayList<String> permutations2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i <= p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            ans.addAll(permutations2(s+ch+e,up.substring(1)));
        }
        return ans;
    }

    static int permutations3(String p,String up){
        if(up.isEmpty()){
            // System.out.println(p);
            return 1 ;
        }
        char ch = up.charAt(0);
        int count=0;
        for(int i=0;i <= p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            count += permutations3(s+ch+e,up.substring(1));
        }
        return count;
    }
}