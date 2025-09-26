//1588
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        // Iterate over all possible odd lengths
        for (int len = 1; len <= n; len += 2) {
            // Slide a window of size len
            for (int start = 0; start <= n - len; start++) {
                int subSum = 0;
                for (int i = start; i < start + len; i++) {
                    subSum += arr[i];
                }
                totalSum += subSum;
            }
        }

        return totalSum;
    }
}
