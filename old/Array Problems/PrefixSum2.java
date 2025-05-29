import java.util.ArrayList;
public class PrefixSum2{
    public static void main(String[]args){
        int[]L = {1,2,3};
        int[]R = {3,5,7};
        System.out.println(maxOccuring(L,R));
    }
    public static int maxOccuring(int[]L,int[]R){
        ArrayList<Integer> arr = new ArrayList<Integer>(1000);
        for(int i=0;i<L.length;i++){
            arr.set(L[i],1);
            arr.set(R[i]+1,-1);
        }
        // System.out.println(Arrays.toString(arr));
        int max = arr.get(0);
        int res = 0;
        for(int i=1;i<1000;i++){
            arr.set(i,(arr.get(i)+arr.get(i-1)));
            if(max < arr.get(i)){
                max = arr.get(i);
                res = i;
            }
        }
        return max;
    }
}