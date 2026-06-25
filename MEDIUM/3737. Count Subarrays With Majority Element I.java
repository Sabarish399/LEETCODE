// Problem: 3737. Count Subarrays With Majority Element I
// Link: https://leetcode.com/problems/count-subarrays-with-majority-element-i/
//
// Approach:
// - Enumerate every possible subarray using two nested loops.
// - Maintain the count of the target element while extending the current subarray.
// - For each subarray, check if the target appears more than half of its length.
// - If the condition is satisfied, increment the answer.
// - Return the total number of valid subarrays.
//
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution 
{
    public int countMajoritySubarrays(int[] nums, int target) 
    {
        int res = 0;

        for(int i=0;i<nums.length;i++)
        {
            int count = 0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j] == target) count++;
                if(count > (j-i+1)/2) res++; 
            }
        }

        return res;
    }
}
