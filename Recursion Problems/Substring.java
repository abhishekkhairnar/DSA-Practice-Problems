import java.util.*;
public class Substring{
    public static void main(String[]args){
        ascii("","abc");
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    // returning arraylist
    static ArrayList<String> subseqlist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  subseqlist(p+ch,up.substring(1));
        ArrayList<String> right =  subseqlist(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void ascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ascii(p+ch,up.substring(1));
        ascii(p,up.substring(1));
        ascii(p+(ch+0),up.substring(1));
    }
}