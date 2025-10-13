// Problem: 1004. Max Consecutive Ones III
// Link: https://leetcode.com/problems/max-consecutive-ones-iii/
// Approach: Use the sliding window technique.  
//           Expand the window by moving `right`. If the count of zeros exceeds `k`,  
//           shrink the window from the left until it becomes valid again.  
//           Track the maximum valid window size throughout the process.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int left = 0;
        int maxLen = 0;
        int zeros = 0;

        for(int right = 0;right<nums.length;right++)
        {
            if(nums[right]==0) zeros++;

            while(zeros>k)
            {
                if(nums[left]==0) zeros--;
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
        } 
        return maxLen;
    }
}
