import java.util.*;
public class Sorting{
    public static void main(String[]args){
        Integer []arr={2,3,6,2,8,2};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr,Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,2,6);
        System.out.println(Arrays.toString(arr));
    }
}