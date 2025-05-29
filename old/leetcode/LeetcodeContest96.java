public class LeetcodeContest96
{
    // practicing leetcode problems
    public static void main(String[]args)
    {
        int[]arr1 = {1,2,3};
        int[]arr2 = {2,4};
        System.out.println(getCommon(arr1,arr2));    
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int p1=0;
        int p2=0;
        // int n = Math.max(nums1.length,nums2.length);
        while(p1<nums1.length && p2<nums2.length)
        {   
            if(nums1[p1]==nums2[p2])
            {
                return nums1[p1];
            }
            if(nums1[p1]<nums2[p2])
            {
                p1++;
            }
            else
            {
                p2++;
            }
        }
        return -1; 
    }
}