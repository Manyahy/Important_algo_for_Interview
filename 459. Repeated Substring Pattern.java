

/*Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.*/
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        
        for (int i = 1; i <= len / 2; i++) {
            // Only consider substring lengths that divide the full length
            if (len % i == 0) {
                String sub = s.substring(0, i); // candidate substring
                StringBuilder sb = new StringBuilder();

                // Repeat the substring len/i times
                for (int j = 0; j < len / i; j++) {
                    sb.append(sub);
                }

                // Compare the built string with the original
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        

        return false;
    }
}
