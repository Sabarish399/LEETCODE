// Problem: 2574. Left and Right Sum Differences
// Link: https://leetcode.com/problems/left-and-right-sum-differences/
// Approach:
//   First compute the total sum of the array.
//   Iterate through the array while maintaining a running left sum.
//   For each index i:
//     - rightSum = totalSum - leftSum - nums[i]
//     - answer[i] = |leftSum - rightSum|
//   Update leftSum after processing each index.
// Time Complexity: O(n)
// Space Complexity: O(1) extra (output array excluded)

class Solution 
{
    public int[] leftRightDifference(int[] nums) 
    {
        if(nums.length<2) return new int[]{0};

        int n = nums.length;
        int[] answer = new int[n];

        int totSum = 0;
        int leftSum = 0;

        for(int i:nums) totSum += i;

        for(int i=0;i<n;i++)
        {
            int rightSum = totSum - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }   
        
        return answer;
    }
}
