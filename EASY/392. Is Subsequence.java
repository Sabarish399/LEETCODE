// Problem: 392. Is Subsequence
// Link: https://leetcode.com/problems/is-subsequence/
// Approach: Use two-pointer technique.  
//           One pointer (`i`) tracks the current character in `s`,  
//           and another (`j`) iterates through `t`.  
//           Increment `i` whenever characters match.  
//           If `i` reaches the end of `s`, all characters were found in order.
// Time Complexity: O(n) — where n is the length of `t`.
// Space Complexity: O(1) — constant extra space.

class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int i=0,j=0;

        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }

        return i==s.length();
    }
}
