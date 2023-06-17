public class MergeTwoStrings{
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "pqrs";
        System.out.println(merge(s1, s2));
    }

    // You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

    public static String merge(String s1, String s2){
        StringBuilder sb = new StringBuilder();

        // write your logic here
        int l1 = s1.length();
        int l2 = s2.length();

        int minlength = Math.min(l1,l2);
        int ptr=0;
        for(int i=0;i<minlength;i++){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
            ptr=i;
        }
        if(l1 == l2){
            return sb.toString();
        }
        if(l1 > minlength){
            for(int i=ptr+1;i<l1;i++){
                sb.append(s1.charAt(i));
            }
        }
        else if(l2 > minlength){
            for(int i=ptr+1;i<l2;i++){
                sb.append(s2.charAt(i));
            }
        }
        return sb.toString();
    }
}