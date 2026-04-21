// Problem: 3794.Reverse String Prefix
// Link: https://leetcode.com/problems/reverse-string-prefix/
// Approach:
// - Reverse substring from index 0 to k-1.
// - Append remaining part of string as-is.
// - Use StringBuilder for efficient construction.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public String reversePrefix(String s, int k) 
    {
        StringBuilder sb = new StringBuilder();

        for(int i=k-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
