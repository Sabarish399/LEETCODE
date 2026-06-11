// Problem: 42. Trapping Rain Water
// Link: https://leetcode.com/problems/trapping-rain-water/
//
// Approach:
// - Precompute the maximum height to the left of each index.
// - Precompute the maximum height to the right of each index.
// - The water trapped at each index is the minimum of the left and right
//   maximum heights minus the current height.
// - Sum the trapped water at all indices to get the final answer.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int trap(int[] height) 
    {
        int n = height.length;

        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        int max = -1;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,height[i]);
            maxLeft[i] = max;
        }

        max = -1;
        for(int i=n-1;i>=0;i--)
        {
            max = Math.max(max,height[i]);
            maxRight[i] = max;
        }

        int ans = 0;
        for(int i=0;i<n;i++)
        {
            ans += Math.min(maxLeft[i],maxRight[i]) - height[i];
        }

        return ans;
    }
}
