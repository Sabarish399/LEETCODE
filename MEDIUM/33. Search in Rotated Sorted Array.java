// Problem: 33. Search in Rotated Sorted Array
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
// Approach: Modified Binary Search
//   - In a rotated sorted array, one half (left or right) will always be sorted.
//   - Check which half is sorted and then decide if the target lies inside it.
//   - Adjust search boundaries accordingly.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int search(int[] nums, int target)
    {

        int left = 0, right = nums.length-1, mid = 0;
        
        while(left<=right)
        {
            mid = left+(right-left)/2;
            
            if(nums[mid] == target)
                return mid;
            
            if(nums[left] <= nums[mid])
            {
                if(nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                   left = mid + 1;
            }
            
            else
            {
                if(nums[mid] < target && target <= nums[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
        }  
        return -1;
    }
}
