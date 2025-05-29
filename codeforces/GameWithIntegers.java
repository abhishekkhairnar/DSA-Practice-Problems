import java.util.*;

public class GameWithIntegers {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            solve();
        }
    }
    public static void solve() {
        int n = Integer.parseInt(sc.nextLine());

        if ((n + 1) % 3 == 0) System.out.println("First");
        else if ((n - 1) % 3 == 0) System.out.println("First");
        else System.out.println("Second");
    }
}

/**
 * (1, 2, 3, 4, 5)
 * (1, 2, 3, 5, 4)
 *
 * (1, 2, 4, 3, 5)
 *
 * (1, 5, 4, 3, 2)
 *
 * (5, 4, 3, 2, 1)
 *
 * (3, 1, 4, 2, 5)
 */