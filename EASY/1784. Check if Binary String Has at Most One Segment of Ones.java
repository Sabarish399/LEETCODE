// Problem: 1784. Check if Binary String Has at Most One Segment of Ones
// Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
//
// Approach:
// - Traverse the string from index 1 to end.
// - If we ever see a pattern "01" followed by '1' (i.e., "011"),
//   it means a second segment of '1's has started.
// - Specifically check:
//     • if s[i] == '1' AND s[i-1] == '0'
//     • return false immediately.
// - If no such pattern exists, return true.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean checkOnesSegment(String s) 
    {
        for(int i=1;i<s.length();i++)
            if(s.charAt(i) == '1' && s.charAt(i-1)=='0')
                return false;
        return true;
    }
}
