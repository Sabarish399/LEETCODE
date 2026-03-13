// Problem: 35. Search Insert Position
// Link: https://leetcode.com/problems/search-insert-position/
//
// Approach (Binary Search):
// - Use binary search to find the target or its insertion point.
// - Maintain two pointers: left = 0 and right = n-1.
// - While left <= right:
//     • Compute mid = left + (right - left) / 2.
//     • If nums[mid] == target → return mid.
//     • If nums[mid] > target → move right = mid - 1.
//     • Otherwise → move left = mid + 1.
// - If target is not found, the correct insertion index is `left`.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int left=0,right=nums.length-1,mid=0;
        while(left<=right)
        {
            mid = left+(right-left)/2;

            if(nums[mid]==target) return mid;
            else if(nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        return (target>nums[mid]) ? mid+1 : mid; 
    }
}
