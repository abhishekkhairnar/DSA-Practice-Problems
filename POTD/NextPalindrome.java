import java.util.Vector;

public class NextPalindrome{
    public static void main(String[] args) {
        int[] nums = {4,6,4};
        int n = nums.length;
        System.out.println(generateNextPalindrome(nums,n));
    }

    private static Vector<Integer> nextPlaindrome(int[] nums, int n) {
        Vector<Integer> v = new Vector<>();

        // convert into string to check if it is palindrome
        StringBuilder sb = new StringBuilder();
        for(int i : nums)
            sb.append(i);
        String s = sb.toString();

        // 1 . if it is palindrome
        // if(isPalindrome(s)){
        //     for(int i : nums) v.add(i);
        //     return v;
        // }

        // 2 . if it is odd length

        if(s.length() % 2 != 0){
            // if starting part reversed and it is greater than next part then put reversed string in next part
            StringBuilder part1 =new StringBuilder(s.substring(0, n/2));
            // System.out.println(part1);

            String part2 = s.substring(n/2+1, n);
            // System.out.println(part2);

            long p1 = Long.parseLong(part1.reverse().toString());
            long p2 = Long.parseLong(part2);

            if(p1 > p2) {
                int start = 0;
                int end = n-1;
                while(start < end){
                    nums[end] = nums[start];
                    end--;
                    start++;
                }
                for(int i : nums) v.add(i);
                return v;
            }
            else{
                // plus one in middle element
                if(nums[n/2] == 9){
                    nums[n/2] = 0;
                    nums[n/2-1]++;
                }
                else{
                    nums[n/2]++;
                }
                int start = 0;
                int end = n-1;
                while(start < end){
                    nums[end] = nums[start];
                    end--;
                    start++;
                }
                for(int i : nums) v.add(i);
                return v;
            }
            
        }

        // 3 . if it is even length

        else{

            StringBuilder part1 =new StringBuilder(s.substring(0, n/2));
            System.out.println(part1);

            String part2 = s.substring(n/2, n);
            System.out.println(part2);

            long p1 = Long.parseLong(part1.reverse().toString());
            long p2 = Long.parseLong(part2);

            System.out.println("p1 "+p1);
            System.out.println("p2 "+p2);

            if(p1 > p2) {
                int start = 0;
                int end = n-1;
                while(start < end){
                    nums[end] = nums[start];
                    end--;
                    start++;
                }
                for(int i : nums) v.add(i);
                return v;
            }
            else{
                // plus one in middle element
                if(nums[n/2-1] == 9){
                    nums[n/2-1] = 0;
                    nums[n/2-2]++;
                }else{
                    nums[n/2-1]++;
                }
                int start = 0;
                int end = n-1;
                while(start < end){
                    nums[end] = nums[start];
                    end--;
                    start++;
                }
                for(int i : nums) v.add(i);
                return v;
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
















    static Vector<Integer> generateNextPalindromeUtil(int num[], int n)
    {
        int mid = n / 2;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;
        boolean leftsmaller = false;
        while (i >= 0 && num[i] == num[j])
        {
            i--;
            j++;
        }
        if (i < 0 || num[i] < num[j])
        {
            leftsmaller = true;
        }
        while (i >= 0)
        {
            num[j++] = num[i--];
        }
        if (leftsmaller)
        {
            int carry = 1;
            if (n % 2 == 1) {
                num[mid] += 1;
                carry = num[mid] / 10;
                num[mid] %= 10;
            }
            i = mid - 1;
            j = (n % 2 == 0 ? mid : mid + 1);
            while (i >= 0 && carry>0) 
            {
                num[i] = num[i] + carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j] = num[i];// copy mirror to right
                i--;
                j++;
            }
        }

        Vector v = new Vector<>();
        for(int number:num) v.add(number);
        return v;
    }
    static Vector<Integer> generateNextPalindrome(int num[], int n)
    {
         Vector<Integer> v = new Vector<>();
        if (isAll9(num, n)) {
            v.add(1);
            for (int i = 0; i < n - 1; i++)
                v.add(0);
            v.add(1);
        }
        else {
            v = generateNextPalindromeUtil(num, n);
        }
        return v;
    }
    static boolean isAll9(int num[], int n) {
        for (int i = 0; i < n; i++)
            if (num[i] != 9)
                return false;
        return true;
    }
    
}