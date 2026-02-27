// Problem: 1480. Running Sum of 1d Array
// Link: https://leetcode.com/problems/running-sum-of-1d-array/
//
// Approach (Prefix Sum):
// - Maintain a variable `sum` initialized to 0.
// - Traverse the array from left to right:
//     • Add current element to `sum`.
//     • Update nums[i] = sum.
// - Return modified array.
//
// Time Complexity: O(n)
// Space Complexity: O(1) — in-place modification.

class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
