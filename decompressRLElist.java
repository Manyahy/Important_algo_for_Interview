//1313
import java.util.*;

class Solution {
    public int[] decompressRLElist(int[] nums) {
       
        List<Integer> resultList = new ArrayList<>();

       
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            
            for (int j = 0; j < freq; j++) {
                resultList.add(val);
            }
        }

      
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
