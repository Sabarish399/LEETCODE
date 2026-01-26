// Problem: 29. Divide Two Integers
// Link: https://leetcode.com/problems/divide-two-integers/
// Approach:
//   Handle the overflow edge case where dividend = Integer.MIN_VALUE
//   and divisor = -1, which exceeds the 32-bit signed integer range.
//   For all other cases, use Java’s integer division operator.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        return Integer.MAX_VALUE;
        
        return dividend/divisor;
    }
}
