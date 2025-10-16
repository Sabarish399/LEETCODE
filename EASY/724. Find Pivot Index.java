// Problem: 724. Find Pivot Index
// Link: https://leetcode.com/problems/find-pivot-index/
// Approach: First, calculate the total sum of the array. 
//           Then iterate through each index while maintaining a running `leftSum`.  
//           For each element, compute `rightSum = totalSum - nums[i] - leftSum`.  
//           If `leftSum` equals `rightSum`, return the current index as the pivot.  
//           If no such index is found, return -1.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
        int totalSum = 0;
        int leftSum = 0;

        for(int i:nums)
        {
            totalSum += i;
        }

        for(int i=0;i<n;i++)
        {
            int rightSum = totalSum - nums[i] - leftSum;

            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
