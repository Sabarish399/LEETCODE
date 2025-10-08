// Problem: 11. Container With Most Water
// Link: https://leetcode.com/problems/container-with-most-water/
// Approach: Two-pointer technique.  
//           Start with the widest container (left = 0, right = n - 1).  
//           Calculate the area and move the pointer with the smaller height inward,  
//           since the height limits the area. Continue until pointers meet.
// Time Complexity: O(n) — each element is visited at most once.
// Space Complexity: O(1) — constant extra space.

class Solution 
{
    public int maxArea(int[] height) 
    {
        int left = 0, right = height.length-1;
        int maxArea = 0;
        while(left<right)
        {
            int breadth = right - left;
            int length = Math.min(height[right],height[left]);

            int currArea = breadth * length;
            maxArea = Math.max(maxArea,currArea);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
