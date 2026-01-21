class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target||nums[i]>target){
                return i;
            }
            if(i==nums.length-1&&target>nums[i]){
                return i+1;
            }
           
        }
        return -1;
    }
    
}
