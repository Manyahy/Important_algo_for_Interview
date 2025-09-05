/* Longest Common Subsequence

Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
*/
class Solution {
    private int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        if (m == 0 || n == 0) return 0;

        dp = new int[m][n];
        // fill dp with -1 (uncomputed)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return dfs(text1, text2, 0, 0);
    }

    private int dfs(String text1, String text2, int i, int j) {
        if (i == text1.length() || j == text2.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + dfs(text1, text2, i + 1, j + 1);
        } else {
            dp[i][j] = Math.max(
                dfs(text1, text2, i + 1, j),
                dfs(text1, text2, i, j + 1)
            );
        }

        return dp[i][j];
    }
}
