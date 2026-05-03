// Problem: 796. Rotate String
// Link: https://leetcode.com/problems/rotate-string/
//
// Approach:
// - If lengths differ → cannot be rotation.
// - A string s can be rotated to goal iff goal is a substring of (s + s).
// - Why? Because all possible rotations of s are contained in s+s.
// - Check using contains().
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        if(s.length() != goal.length()) return false;
        return (s+s).contains(goal);
    }
}
