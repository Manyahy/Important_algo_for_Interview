//1470
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            int j=nums[i+n];
            a[k]=nums[i];
            k++;
            a[k]=j;
            k++;
        }
        return a;
    }
}
