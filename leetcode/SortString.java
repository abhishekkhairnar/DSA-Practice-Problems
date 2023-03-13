public class SortString
{
    public static void main(String[] args) {
        String s = "is2 This1 String4 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {

        String[]arr=new String[9];
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' '){
                str = new StringBuilder("");
                continue;
            }
            if(s.charAt(i) != '1'&& s.charAt(i) !='2'&&s.charAt(i) !='3'&&s.charAt(i) !='4'&&s.charAt(i) !='5'&&s.charAt(i) !='6'&&s.charAt(i) !='7'&&s.charAt(i) !='8'&&s.charAt(i) !='9' )
            {
                str.append(s.charAt(i));
            }
            else{        
                switch(s.charAt(i)) {
                case '1':
                    arr[0] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '2':
                    arr[1] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '3':
                    arr[2] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '4':
                    arr[3] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '5':
                    arr[4] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '6':
                    arr[5] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '7':
                    arr[6] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '8':
                    arr[7] = str.toString();
                    str= new StringBuilder("");
                    break;
                case '9':
                    arr[8] = str.toString();
                    str= new StringBuilder("");
                    break;
                }
            }
        }
        str = new StringBuilder("");
        for(int i=0;i<9;i++)
        {
            if(arr[i] == null){
                break;
            }
            str.append(arr[i]);
            if(i <= 7 && arr[i+1] != null){
                str.append(" ");
            }
        }
        return str.toString();
    }
}