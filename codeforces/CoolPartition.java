import java.util.*;

public class CoolPartition {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = Integer.parseInt(sc.nextLine());
        String[] strArr = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(strArr[i]);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        int maxWindowSizePossible = 0;

        for (int i : map.values()) maxWindowSizePossible = Math.max(maxWindowSizePossible, i);


    }
}