//942
import java.util.*;

public class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0, high = n;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low;
                low++;
            } else { // 'D'
                result[i] = high;
                high--;
            }
        }
        // Last number will be either low or high (both are equal now)
        result[n] = low;
        return result;
    }
}
