// Problem: 704. Binary Search
// Link: https://leetcode.com/problems/binary-search/
// Approach: Use iterative binary search. Keep two pointers (left and right), 
//           find mid, and narrow down the search space based on comparison.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int search(int[] nums, int target) 
    {
        int left=0,right=nums.length-1,mid;
        
        while(left<=right)
        {
            mid = (left+right)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid -1;
        }
        return -1;
    }       
}
