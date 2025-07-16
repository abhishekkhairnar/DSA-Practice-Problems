import java.util.*;

public class Shrink {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];

        int high = 0;
        int low = n - 1;

        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                arr[high] = i;
                high++;
            } else {
                arr[low] = i;
                low--;
            }
        }
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}