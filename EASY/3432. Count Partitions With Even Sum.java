// Problem: 3432. Count Partitions With Even Sum
// Link: https://leetcode.com/problems/count-partitions-with-even-sum/
// Approach: 
//   Compute the total sum of the array.
//   A prefix–suffix split produces two parts. For both to have even sums, the total sum must be even.
//   If total sum is even, all (n - 1) split points are valid, because splitting does not change parity.
//   If total sum is odd, no split point can give even-even parts.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int countPartitions(int[] nums) 
    {
        int totSum = 0;
        for(int i:nums)
        {
            totSum += i;
        }
        return totSum%2==0 ? nums.length-1 : 0;
    }
}
