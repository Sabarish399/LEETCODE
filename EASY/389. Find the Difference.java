// Problem: 389. Find the Difference
// Link: https://leetcode.com/problems/find-the-difference/
// Approach:
//   Use the ASCII sum technique.
//   Add the ASCII values of all characters in string t,
//   subtract the ASCII values of all characters in string s.
//   The remaining value corresponds to the extra character in t.
//   (An alternative is XOR, but sum works equally well here.)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        int sum = 0;
        for(char c:t.toCharArray())
            sum += (int)c;
        for(char c:s.toCharArray())
            sum -= (int)c;
            
        char c = (char)sum;
        return c;
    }
}
