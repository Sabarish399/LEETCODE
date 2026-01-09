// Problem: 201. Bitwise AND of Numbers Range
// Link: https://leetcode.com/problems/bitwise-and-of-numbers-range/
// Approach:
//   The bitwise AND of all numbers in [left, right] keeps only the common prefix bits.
//   Repeatedly remove the least significant set bit from `right` using (right & (right - 1))
//   until right <= left. This effectively eliminates bits that cannot stay set across the range.
//   The remaining value is the result.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int rangeBitwiseAnd(int left, int right) 
    {
        int shifts = 0;
        while(right > left)
        {
            right &= (right-1);
        }
        return right;
    }
}
