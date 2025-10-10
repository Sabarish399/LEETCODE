// Problem: 643. Maximum Average Subarray I
// Link: https://leetcode.com/problems/maximum-average-subarray-i/
// Approach: Use a sliding window of size k to maintain the sum of current k elements.  
//           Move the window by subtracting the element going out and adding the new one.  
//           Track the maximum sum seen during traversal and return its average.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        double sum = 0, maxSum = 0;

        for(int i=0;i<k;i++)
        {
            sum += nums[i];
        }
        maxSum = sum;
        for(int i=k;i<nums.length;i++)
        {
            sum += nums[i]-nums[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        return (double) maxSum/k;
    }
}
