import java.util.*;
public class DialPad{
    public static void main(String[]args){
        System.out.println(pad2("","23"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i=(digit - 1)*3;i < digit*3 ; i++){
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
    //returning arraylist
    static List<String> pad2(String p,String up){
        if(up.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for(int i=(digit - 2)*3;i < digit*3 ; i++){
            char ch = (char) ('a' + i);
            list.addAll(pad2(p+ch,up.substring(1)));
        }
        return list;
    }
}