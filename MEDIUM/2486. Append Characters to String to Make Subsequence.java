// Problem: 2486. Append Characters to String to Make Subsequence
// Link: https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
//
// Approach (Two Pointers - Subsequence Check):
// - Use two pointers:
//     • i for string s
//     • j for string t
// - Traverse s:
//     • If s.charAt(i) == t.charAt(j), increment j.
//     • Always increment i.
// - At the end:
//     • If j == t.length(), t is already a subsequence → return 0.
//     • Otherwise, return remaining characters needed → t.length() - j.
//
// Time Complexity: O(n)
//     - n = s.length()
// Space Complexity: O(1)

class Solution 
{
    public int appendCharacters(String s, String t) 
    {
        int i=0,j=0;

        while( i<s.length() && j<t.length() )
        {
            if(s.charAt(i)==t.charAt(j)) j++;
            i++;
        }
        return j==t.length() ? 0 : t.length()-j;
    }
}
