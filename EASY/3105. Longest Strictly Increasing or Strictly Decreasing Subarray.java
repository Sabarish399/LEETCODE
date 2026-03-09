// Problem: 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
// Link: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
//
// Approach:
// - Track two lengths while scanning the array:
//     • inc → length of current strictly increasing subarray
//     • dec → length of current strictly decreasing subarray
// - For each element from index 1 to end:
//     • If nums[i] > nums[i-1], extend increasing sequence.
//     • If nums[i] < nums[i-1], extend decreasing sequence.
//     • If nums[i] == nums[i-1], reset both.
// - Maintain maxLen as the maximum of inc and dec.
// - Return maxLen.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int longestMonotonicSubarray(int[] nums) 
    {
        int n1 = 1;
        int n2 = 1;
        int maxLen = 1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1] < nums[i]){n1++; n2 = 1;}
            else if(nums[i-1] > nums[i]){n2++; n1 = 1;}
            else {n1=1; n2=1;}
            maxLen = Math.max(maxLen,Math.max(n1,n2));
        }
        return maxLen;
    }
}
