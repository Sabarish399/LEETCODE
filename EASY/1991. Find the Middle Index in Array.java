// Problem: 1991. Find the Middle Index in Array
// Link: https://leetcode.com/problems/find-the-middle-index-in-array/
// Approach: Compute the total sum of the array first.  
//           Then iterate through each element while maintaining a running `leftSum`.  
//           For every index, calculate `rightSum = totalSum - nums[i] - leftSum`.  
//           If `leftSum` equals `rightSum`, return the current index as the middle index.  
//           If no such index exists, return -1.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution
{
    public int findMiddleIndex(int[] nums)
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
            int rightSum = totalSum - nums[i]- leftSum;

            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
