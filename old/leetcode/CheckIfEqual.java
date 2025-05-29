public record CheckIfEqual() {
    public static void main(String[] args) {
        String[]arr1={"ab","c"};
        String[]arr2={"a","bcd"};
        System.out.println(arrayStringsAreEqual(arr1, arr2));
    }
    public static boolean arrayStringsAreEqual(String[]word1, String[]word2)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word1.length;i++)
        {
            sb.append(word1[i]);
        }
        String s1 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<word2.length;i++)
        {
            sb2.append(word2[i]);
        }
        String s2 = sb2.toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
