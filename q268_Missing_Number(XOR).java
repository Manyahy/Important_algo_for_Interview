//Own
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return n;
    }
}
//Optimum using XOR
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // XOR all indices and values
        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        // XOR with n (last index)
        xor ^= n;

        return xor;
    }
}
