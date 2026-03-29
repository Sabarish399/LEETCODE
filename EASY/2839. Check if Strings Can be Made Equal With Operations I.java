// Problem: 2839. Check if Strings Can be Made Equal With Operations I
// Link: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/
//
// Approach:
// - Allowed operation lets you swap:
//     • indices (0,2)
//     • indices (1,3)
// - So positions {0,2} form one group and {1,3} form another.
// - Check if characters in these groups match between s1 and s2 (order doesn't matter).
// - Return true if both groups match.
//
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public boolean canBeEqual(String s1, String s2) 
    {
        return (
                s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2) ||
                s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0))
                &&
                (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3) ||
                s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1)
                );
    }
}
