// Problem: 1422. Maximum Score After Splitting a String
// Link: https://leetcode.com/problems/maximum-score-after-splitting-a-string/
//
// Approach:
// - Count total number of '1's in the string.
// - Traverse from left to right (excluding last index):
//     • Maintain:
//         - zeros → count of '0's on the left
//         - ones  → remaining '1's on the right
//     • If current char is '0' → zeros++
//       Else → ones--
//     • Compute score = zeros + ones
//     • Track maximum score
// - Return max score.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxScore(String s) 
    {
        int ones = 0;

        for(char c:s.toCharArray())
            if(c=='1') ones++;

        int zeros = 0;
        int max = 0;
        
        for(int i=0;i<s.length()-1;i++) 
        {
            if(s.charAt(i)=='0') zeros++;
            else ones--;

            max = Math.max(max,zeros+ones);
        }
        return max;
    }
}
