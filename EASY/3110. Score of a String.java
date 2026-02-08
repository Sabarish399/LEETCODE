// Problem: 3110. Score of a String
// Link: https://leetcode.com/problems/score-of-a-string/
// Approach:
// - Initialize an integer variable `sum` to store the total score.
// - Iterate through the string starting from index 1.
// - For each character:
//     • Compute the absolute difference between the ASCII values of
//       the current character and the previous character.
//     • Add this difference to `sum`.
// - Return the final accumulated `sum`.
//
// Time Complexity: O(n) — single pass through the string.
// Space Complexity: O(1) — only constant extra space used.

class Solution 
{
    public int scoreOfString(String s) 
    {
        int sum = 0;
        for(int i=1;i<s.length();i++)
            sum += Math.abs(s.charAt(i-1) - s.charAt(i));
            
        return sum;
    }
}
