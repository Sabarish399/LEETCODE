// Problem: 1143. Longest Common Subsequence
// Link: https://leetcode.com/problems/longest-common-subsequence/
//
// Approach:
// - Create a DP table where dp[i][j] represents the length of the longest common
//   subsequence between the first i characters of text1 and the first j characters of text2.
// - If the current characters match, extend the previous subsequence by 1.
// - Otherwise, take the maximum value by excluding one character from either string.
// - Fill the DP table iteratively and return the value at dp[n][m].
//
// Time Complexity: O(n × m)
// Space Complexity: O(n × m)

class Solution 
{
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int[][] dp = new int[text1.length()+1][text2.length()+1];

        for(int i=1;i<=text1.length();i++)
        {
            for(int j=1;j<=text2.length();j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
