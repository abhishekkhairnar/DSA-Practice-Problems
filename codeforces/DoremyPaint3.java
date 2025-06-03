import java.util.*;

public class DoremyPaint3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            solve();
        }
    }
    public static void solve(){
        int size = Integer.parseInt(sc.nextLine());
        String[] numbers = sc.nextLine().split(" ");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        if (map.size() > 2) {
            System.out.println("no");
            return;
        }
        if (map.size() == 1) {
            System.out.println("yes");
            return;
        }

        List<Integer> values = new ArrayList<>(map.values());

        if (Math.abs(values.get(0) - values.get(1)) <= 1) {
            System.out.println("yes");
            return;
        }

        System.out.println("no");
    }
}