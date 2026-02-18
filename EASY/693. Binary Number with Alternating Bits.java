// Problem: 693. Binary Number with Alternating Bits
// Link: https://leetcode.com/problems/binary-number-with-alternating-bits/
//
// Approach:
// - Compute xor = n ^ (n >> 1).
// - If n has alternating bits, xor will be all 1s.
// - A number with all 1s satisfies: (x & (x + 1)) == 0.
// - Return whether (xor & (xor + 1)) == 0.
//
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public boolean hasAlternatingBits(int n) 
    {
        int xor = n ^ (n >> 1);

        return (xor & (xor + 1)) == 0;
    }
}
