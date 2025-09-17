// Problem: 34. Find First and Last Position of Element in Sorted Array
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Approach: Perform two binary searches.
//           - First pass: find the leftmost occurrence of target.
//           - Second pass: find the rightmost occurrence of target.
//           If target is not found, return [-1, -1].
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {        
        int left=0, right=nums.length-1;
        int []arr = {-1,-1};
        
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid]==target)
            {
               arr[0]=mid;
                right = mid-1;
            }
            else if(nums[mid]<target)
                left = mid+1;
            else
                right = mid-1;
        }

        left =0;
        right=nums.length-1;

        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid]==target)
            {
                arr[1]=mid;
                left= mid+1;
            }
            else if(nums[mid]<target)
                left = mid+1;
            else
                right = mid-1;
        }

        return arr;
    }
}
