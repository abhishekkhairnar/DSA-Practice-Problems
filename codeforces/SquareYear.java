import java.util.*;

public class SquareYear {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int num = Integer.parseInt(in.nextLine());
        double sqrt = Math.sqrt(num);

        if (sqrt % 1 != 0) {
            System.out.println("-1");
            return;
        }

        System.out.println("0 " + (int)sqrt);
    }
}