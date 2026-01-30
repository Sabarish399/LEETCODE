// Problem: 231. Power of Two
// Link: https://leetcode.com/problems/power-of-two/
// Approach:
//   A power of two has exactly one set bit in binary representation.
//   Using the property:
//       n & (n - 1) == 0
//   clears the lowest set bit. This holds only for powers of two.
//   Ensure n > 0 to exclude zero and negative numbers.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public boolean isPowerOfTwo(int n)
    {
        return n>0 && (n&(n-1))==0;
    }
}
