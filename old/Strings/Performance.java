package Strings;

public class Performance {
    public static void main(String[] args) {
        
        // for(int i=0;i<26;i++)
        // {
        //     char ch = (char)('a'+i);
        //     System.out.println(ch);
        // }
        String series ="";
        for(int i=0;i<1000;i++)
        {
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
