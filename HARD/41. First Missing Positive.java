// Problem: 41. First Missing Positive
// Link: https://leetcode.com/problems/first-missing-positive/
// Approach:
//   Use the array itself as a hash to record presence of numbers in [1, n].
//   1) Replace all non-positive numbers and numbers > n with a dummy value (n + 1).
//   2) For each value v in the array, mark index (v - 1) as negative to indicate presence.
//   3) The first index with a positive value indicates the missing smallest positive integer.
// Time Complexity: O(n)
// Space Complexity: O(1) — in-place modification

class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        int n = nums.length;

        for(int i=0;i<n;i++)
        {
            if(nums[i] <= 0 || nums[i] > n)
                nums[i] = n+1;
        }

        for(int i=0;i<n;i++)
        {
            int val = Math.abs(nums[i]);
            if(val <= n) 
                nums[val -1] = -Math.abs(nums[val-1]); 
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0)
                return i+1;
        }
        return n+1;
    }
}
