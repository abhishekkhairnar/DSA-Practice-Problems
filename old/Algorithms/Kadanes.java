package Algorithms;

public class Kadanes {
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArray(a));

    }

    public static int maxSubArray(int[] nums) {
// comeback
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
