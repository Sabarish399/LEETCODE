// Problem: 342. Power of Four
// Link: https://leetcode.com/problems/power-of-four/
// Approach:
//   A number is a power of four if it can be written as 4^k.
//   Use logarithms to compute log base 4 of n:
//       log4(n) = log(n) / log(4)
//   If the result is an integer (fractional part == 0) and n > 0,
//   then n is a power of four.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        if(n<=0) return false;
        return Math.log(n)/Math.log(4) % 1 == 0;
    }
}
