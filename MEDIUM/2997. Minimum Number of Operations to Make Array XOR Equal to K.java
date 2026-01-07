// Problem: 2997. Minimum Number of Operations to Make Array XOR Equal to K
// Link: https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
// Approach:
//   First compute the XOR of all elements in the array.
//   If the total XOR already equals k, no operations are needed.
//   Otherwise, compare the binary representation of totalXor and k bit by bit.
//   Each differing bit requires exactly one operation, so count the number of differing bits.
// Time Complexity: O(n + log(max(nums, k)))
// Space Complexity: O(1)

class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int totXor=nums[0];
        for(int i=1;i<nums.length;i++)
            totXor ^= nums[i]; 
            
        if(totXor == k) return 0;
            
        int count=0;

        while(k>0||totXor>0)
        {
            if((k&1) != (totXor&1))
                count++;

            k >>= 1;
            totXor >>= 1;
        }
        return count;
    }
}
