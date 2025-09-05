class KadaneAlgorithm {
    public static int minSubArray(int[] nums) {
        int currentMin = nums[0];
        int minSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }
        
        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Minimum Subarray Sum: " + minSubArray(arr));
    }
}
