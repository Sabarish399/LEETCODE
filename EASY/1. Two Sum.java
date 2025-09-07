// Problem: 1. Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Approach: Use two nested loops to check every pair of numbers. If the sum equals the target, return their indices.
// Time Complexity: O(n^2) 
// Space Complexity: O(1)

class Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
        int [] arr = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0] = i;
                    arr[1]=j;
                
                }
            }
        }
          return arr;
    }
}
