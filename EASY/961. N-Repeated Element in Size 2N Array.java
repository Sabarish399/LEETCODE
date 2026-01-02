// Problem: 961. N-Repeated Element in Size 2N Array
// Link: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
// Approach:
//   In an array of size 2N where one element is repeated N times,
//   the repeated element must appear at least twice within any window of size 3.
//   Scan the array and compare nums[i] with nums[i+1] and nums[i+2].
//   If no match is found during the scan, the last element must be the repeated one.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i] == nums[i+1] || nums[i] == nums[i+2])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
