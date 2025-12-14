// Problem: 338. Counting Bits
// Link: https://leetcode.com/problems/counting-bits/
// Approach:
//   Dynamic Programming based on bit manipulation.
//   For any number i:
//     - i >> 1 drops the least significant bit.
//     - (i & 1) tells whether i is odd (adds 1 if true).
//   So: res[i] = res[i >> 1] + (i & 1).
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int[] countBits(int n) 
    {
        int res[] = new int[n+1];

        for(int i=1;i<=n;i++)
        {
            res[i] = res[i>>1] + (i&1);
        }
        return res;
    }
}
