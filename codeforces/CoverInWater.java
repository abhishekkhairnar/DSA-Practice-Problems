import java.util.*;

public class CoverInWater {
        public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {

        int n = Integer.parseInt(sc.nextLine());

        String str = sc.nextLine();

        String[] cells = new String[n];

        for (int i = 0; i < n; i++) {
            cells[i] = str.substring(i, i + 1);
        }

        // find longest length of consecutive empty blocks

        int count = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;

        while (index < n) {
            if (cells[index].equals(".")) count++;
            else if (cells[index].equals("#")) {
                max = Math.max(max, count);
                count = 0;
            }
            index++;
        }

        max = Math.max(max, count);

        if (max >= 3) {
            System.out.println(2);
        } else {
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                if (cells[i].equals(".")) {
                    count2++;
                }
            }
            System.out.println(count2);
        }
    }
}