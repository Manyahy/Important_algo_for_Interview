/*1207. Unique Number of Occurrences

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true*/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] c=new int[2002];
        for(int i:arr){
            c[i+1000]++;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==0) continue;
            for(int j=0;j<c.length;j++){
                if(c[j]==0) continue;
                if(i!=j){
                    if(c[i]==c[j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
