import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        // always take input with nextLine to avoid unexpected behaviour of nextInt
        Scanner scanner = new Scanner(System.in);
        byte t = Byte.parseByte(scanner.nextLine());
        while (t-- > 0) {
            String[] secondLine = scanner.nextLine().split(" ");
            byte n = Byte.parseByte(secondLine[0]), k = Byte.parseByte(secondLine[1]);

            int[] boxes = new int[n];
            String[] boxesInput = scanner.nextLine().split(" ");

            for (int i = 0; i < boxesInput.length; i++) {
                boxes[i] = Integer.parseInt(boxesInput[i]);
            }

            if (k > 1) {
                System.out.println("YES");
            } else {
                boolean is = false;
                for (int i = 1; i < boxes.length; i++) {
                    if (boxes[i] < boxes[i - 1]) {
                        System.out.println("NO");
                        is = true;
                        break;
                    }
                }
                if(is == false) {
                    System.out.println("YES");
                }
            }
        }
    }
}