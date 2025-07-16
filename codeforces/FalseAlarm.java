import java.util.*;

public class FalseAlarm {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        String[] nx = sc.nextLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);

        String[] elements = sc.nextLine().split(" ");
        int[] doors = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();

        int firstClosedDoor = -1, lastClosedDoor = -1;
        for (int i = 0; i < doors.length; i++) {
            if (doors[i] == 1) {
                if(firstClosedDoor == -1)firstClosedDoor = i;
                lastClosedDoor = i;
            }
        }

        if (firstClosedDoor == -1 || lastClosedDoor - firstClosedDoor < x) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}