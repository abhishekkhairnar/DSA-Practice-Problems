import java.util.HashSet;

public class HappyGeek {
    public static final int BASE = 31;
    public static final int MOD = 1000000007;

    public static long calculateHash(int[] arr, int start, int end) {
        long hashValue = 0;
        long power = 1;

        for (int i = end; i >= start; i--) {
            hashValue = (hashValue + (arr[i] * power) % MOD) % MOD;
            power = (power * BASE) % MOD;
        }

        return hashValue;
    }

    public static int countHappyMoments(int[] geeksTown, int[] journey, int l, int r) {
        int n = geeksTown.length;
        int m = journey.length;

        // Calculate the hash of the geeksTown array for the given range
        long geeksHash = calculateHash(geeksTown, l - 1, r - 1);

        HashSet<Long> seenHashes = new HashSet<>();
        int happyCount = 0;

        // Iterate through the journey array and calculate hashes for each substring
        for (int i = 0; i <= m - (r - l + 1); i++) {
            long journeyHash = calculateHash(journey, i, i + (r - l));

            if (journeyHash == geeksHash && !seenHashes.contains(journeyHash)) {
                happyCount++;
                seenHashes.add(journeyHash);
            }
        }

        return happyCount;
    }

    public static void main(String[] args) {
        int[] geeksTown = {3,0,1,9};
        int[] journey = {1,3,0,1,9,1,7,3,0,1,9};
        int[][] queries = {{0,3},{1,5},{1,10},{7,9}};


        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int happyCount = countHappyMoments(geeksTown, journey, l, r);
            System.out.println("Happy moments for query [" + l + ", " + r + "]: " + happyCount);
        }
    }
}

