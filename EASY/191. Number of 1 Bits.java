// Problem: 191. Number of 1 Bits
// Link: https://leetcode.com/problems/number-of-1-bits/
// Approach:
//   Use Brian Kernighan’s algorithm.
//   Each iteration clears the lowest set bit using n & (n - 1),
//   so the number of iterations equals the number of set bits.
// Time Complexity: O(k) where k is the number of set bits
// Space Complexity: O(1)

class Solution 
{
    public int hammingWeight(int n) 
    {
        int rem=0,count=0;

        while(n != 0)
        {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
