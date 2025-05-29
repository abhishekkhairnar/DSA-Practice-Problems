public class PalindromicString
{
    public static void main(String[]args)
    {
        String s = "aba";
        System.out.println(isPalindrome(s));
        System.out.println(longestPalindrome(s));
    }
    public static boolean isPalindrome(String str)
     {
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        if(n==1)
            return s;
        String pal=s.substring(0,1);
        for(int i=0;i<n;i++){
            String str = s.substring(i,i+1);
            for(int j=i+1;j<n;j++){
                str += s.substring(j,j+1);
                System.out.println(str);
                if(isPalindrome(str)){
                    System.out.println("Its palindrome");
                    if(str.length() > pal.length()){
                        System.out.println("string initialized");
                        pal = str;
                    }
                }
            }
        }
        return pal;
    }
}