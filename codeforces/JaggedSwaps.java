import java.util.*;

public class JaggedSwaps {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            solve();
        }
    }
    public static void solve() {
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        // check if already sorted
        if (checkIfSorted(arr)) {
            System.out.println("yes");
            return;
        }

        if (arr[0] != 1) {
            System.out.println("no");
            return;
        }
        else {
            System.out.println("yes");
        }
    }

    public static boolean checkIfSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}