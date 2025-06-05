import java.util.*;
public class NotQuiteAPalindromicString {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            solve();
        }
    }
    public static void solve() {
        String[] s = in.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String str = in.nextLine();

        int count0 = 0;
        int count1 = 0;

        for (char c : str.toCharArray()) {
            if (c == '0') {
                count0++;
            } else count1++;
        }

        int pairsOf0 = count0 / 2;
        int pairsOf1 = count1 / 2;

        if(pairsOf1 + pairsOf0 >= k) {
            int diff = Math.abs(pairsOf1 - pairsOf0);
            if(k >= diff) {
                k -= diff;
                if(k%2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}