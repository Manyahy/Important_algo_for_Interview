/*1636. Sort Array by Increasing Frequency

Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

 

Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1*/
import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freq = new int[201]; // because -100..100 → shift by +100

        // Count frequencies
        for (int num : nums) {
            freq[num + 100]++;
        }

        // Convert nums to list (so we can sort with comparator)
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list ,new Comparator<Integer>(){
        @Override
        public int compare(Integer x,Integer y){
            if(freq[x+100]==freq[y+100]){
                return y-x;
            }
            return freq[x+100]-freq[y+100];
        }});


        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
