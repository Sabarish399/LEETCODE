// Problem: 190. Reverse Bits
// Link: https://leetcode.com/problems/reverse-bits/
// Approach:
//   Iterate exactly 32 times (for a 32-bit integer).
//   In each iteration:
//     - Left-shift the result to make space.
//     - Copy the least significant bit of n into result.
//     - Right-shift n to process the next bit.
//   The final result is the bit-reversed integer.
// Time Complexity: O(1) — fixed 32 iterations
// Space Complexity: O(1)

class Solution 
{
    public int reverseBits(int n) 
    {
        int result = 0;

        for(int i=0;i<32;i++)
        {
            result <<= 1;
            if((n&1) == 1) 
                result |= 1;
            n >>= 1;
        }
        return result;
    }
}
