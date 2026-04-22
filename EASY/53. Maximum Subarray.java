// Problem: 53. Maximum Subarray
// Link: https://leetcode.com/problems/maximum-subarray/
//
// Approach (Kadane’s Algorithm):
// - Maintain a running sum of the current subarray.
// - If the running sum becomes negative, reset it to 0.
// - At each step, update the maximum subarray sum.
// - Return the maximum value found.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int sum = 0;
        int max = nums[0];
        for(int i:nums)
        {
            if(sum < 0)
            {
                sum = 0;
            }
            sum += i;
            max = Math.max(max,sum);
        }
        return max;
    }
}
