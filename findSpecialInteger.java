//1287
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n / 4;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > threshold) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        
        // If not found in loop, the first element must be the answer (edge case)
        return arr[0];
    }
}
