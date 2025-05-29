import java.util.*;

public class LineTrip {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        String[] secondLine = sc.nextLine().split(" ");

        int n = Integer.parseInt(secondLine[0]);
        int x = Integer.parseInt(secondLine[1]);

        String[] thirdLine = sc.nextLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(thirdLine[i]);
        }
        // find maximum distance between gas stations

        int maxDistance = arr[0];
        for (int i = 1; i < n; i++) {
            maxDistance = Math.max(arr[i] - arr[i-1], maxDistance);
        }

        maxDistance = Math.max(maxDistance, (x - arr[n-1]) * 2);

        System.out.println(maxDistance);
    }
}