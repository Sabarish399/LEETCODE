// Problem: 2264. Largest 3-Same-Digit Number in String
// Link: https://leetcode.com/problems/largest-3-same-digit-number-in-string/
//
// Approach:
// - Traverse the string and check every substring of length 3.
// - If all three characters are the same:
//     • Compare with current best using string comparison.
//     • Update best if larger.
// - Return best (empty string if none found).
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public String largestGoodInteger(String num) 
    {
        String best = "";
        for (int i=0;i+2<num.length();i++) 
        {
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) 
            {
                best = best.compareTo(num.substring(i, i+3)) > 0 ? best : num.substring(i, i+3);
            }
        }
        return best;
    }
}
