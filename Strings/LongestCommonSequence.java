package Strings;

public class LongestCommonSequence {
    public static void main(String[] args) {
        String[]arr=new String[]{"geeksforgeeks", "geeks", "geek",
            "geezer"};
        System.out.println(lcp(arr,arr.length));
    }

    private static String lcp(String[] arr, int length) {
        int small=0;
        for(int i=1;i<length;i++){
            if(arr[small].length() >= arr[i].length()){
                small = i;
            }
        }
        int start=0;
        int end=arr[small].length()-1;
        boolean flag = false;
        while(end != start){
            int count=0;
            for(int i=0;i<length;i++){
                if(arr[i].startsWith(arr[small].substring(start, end))){
                    count++;
                }
                else{
                    end--;
                    break;
                }
            }
            if(count == length){
                flag = true;
                break;
            }
        }
        return arr[small].substring(start, end);
    }
}
