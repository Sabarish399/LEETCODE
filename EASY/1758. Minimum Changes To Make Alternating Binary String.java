// Problem: 1758. Minimum Changes To Make Alternating Binary String
// Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
//
// Approach:
// - Traverse the string and count the mismatches assuming the alternating
//   pattern starts with '0'.
// - Use the parity of the index to determine the expected character and
//   increment the mismatch count when it differs.
// - The number of changes required for the pattern starting with '1' is
//   the remaining characters, i.e., n - mismatches.
// - Return the minimum changes between the two possible alternating patterns.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int minOperations(String s) 
    {
        int changes = 0;

        for(int i=0;i<s.length();i++)
        {
            changes += (s.charAt(i) ^ i) & 1;
        }
        
        return Math.min(changes, s.length()-changes);
    }
}
