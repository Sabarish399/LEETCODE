// Problem: 521. Longest Uncommon Subsequence I
// Link: https://leetcode.com/problems/longest-uncommon-subsequence-i/
//
// Approach:
// - If both strings are equal:
//     • No uncommon subsequence exists → return -1.
// - Otherwise:
//     • The longer string itself is the longest uncommon subsequence.
// - Why?
//     • A string cannot be a subsequence of another shorter string.
//     • If strings differ and lengths are same, either string works.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int findLUSlength(String a, String b) 
    {
        return a.equals(b) ? -1 : Math.max(a.length(),b.length());
    }
}
