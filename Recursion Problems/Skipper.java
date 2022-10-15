public class Skipper{
    public static void main(String[]args){
        System.out.print(skipAppNotApple("skipapplname"));
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    public static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipapple(up.substring(1));
        }
    }
    public static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
    }
}