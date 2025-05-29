import java.util.*;
public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            if(set1.contains(nums1[i]) && set2.contains(nums1[i]))
            {
                list.add(nums1[i]);
            }
        }
        int[]ans = new int[list.size()];
        int i=0;
        for(int ele:list)
        {
            ans[i] = ele;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2))); 
    }
}
