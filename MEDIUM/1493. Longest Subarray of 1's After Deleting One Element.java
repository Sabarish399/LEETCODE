// Problem: 1493. Longest Subarray of 1's After Deleting One Element
// Link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
// Approach: Use two counters, `curr` for the current streak of 1's and `prev` for the previous streak 
//           before a zero. When a zero is encountered, update `maxLen` with `curr + prev` and shift the window.  
//           Finally, handle the case where the entire array contains only 1's by subtracting 1 as one element must be deleted.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int longestSubarray(int[] nums) 
    {
        int curr = 0;
        int prev = 0;
        int maxLen = 0;

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]==1) curr++;
            else
            {
                maxLen = Math.max(maxLen,curr+prev);
                prev = curr;
                curr = 0;
            }
        }
        maxLen = Math.max(maxLen,curr+prev);
        return nums.length == maxLen ? maxLen-1:maxLen;
    }
}
