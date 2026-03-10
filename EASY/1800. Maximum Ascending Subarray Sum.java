// Problem: 1800. Maximum Ascending Subarray Sum
// Link: https://leetcode.com/problems/maximum-ascending-subarray-sum/
//
// Approach:
// - Maintain a running sum for the current strictly ascending subarray.
// - Start with sum = nums[0] and maxSum = nums[0].
// - Traverse the array from index 1:
//     • If nums[i] > nums[i-1], extend the current ascending subarray (sum += nums[i]).
//     • Otherwise, start a new subarray (sum = nums[i]).
// - Update maxSum at each step.
// - Return maxSum.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxAscendingSum(int[] nums) 
    {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1] < nums[i]) sum += nums[i];
            else sum = nums[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
