import java.util.*;
import java.util.HashMap;
public class Pno1346 {
    public static void main(String[] args) {
        int[]arr={10,2,5,3};
        System.out.println(checkIfExists(arr));
    }
    public static boolean checkIfExists(int[] arr)
    {
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();    
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], i);
        }
        for(int i=0;i<arr.length;i++)
        {
            if( i != map.get(arr[i]) && map.containsKey(arr[i]*2))
            {
                flag = true;
            }
        }
        return flag;
    }
}
