//1331
import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] b = arr.clone(); // Step 1: copy the array
        Arrays.sort(b);        // Step 2: sort the copy

        // Step 3: Create a map to store element → rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : b) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        // Step 4: Replace elements in arr with their rank
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}
