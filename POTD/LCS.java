public class LCS {
    public static void main(String[] args) {
        int A = 12;
        int B = 12;
        String str1 = "ACABBBBDBAAB";
        String str2 = "BBCCBEECDCDE";

        System.out.println(lcs(A,B,str1,str2));
    }    
    static int lcs(int x, int y, String s1, String s2)
    {
        int count=0;
        int AtoZ[] = new int[26];
        for(int i=0;i<x;i++){
            if(AtoZ[s1.charAt(i)-'A'] == 0)
                AtoZ[s1.charAt(i)-'A'] = 1;
        }
        
        for(int i=0;i<y;i++){
            if(AtoZ[s2.charAt(i)-'A'] == 1){
                AtoZ[s2.charAt(i)-'A'] = -1;
            }
        }

        for(int i=0;i<26;i++){
            if(AtoZ[i] != 0){
                count++;
            }
        }
        for(int i=0;i<26;i++){
            System.out.print(AtoZ[i]+" ");
        }

        return count;
    }
}
