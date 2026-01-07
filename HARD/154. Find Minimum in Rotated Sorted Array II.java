// Problem: 154. Find Minimum in Rotated Sorted Array II
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
// Approach:
//   Modified binary search to handle duplicates.
//   Compare nums[mid] with nums[right]:
//     - If nums[mid] > nums[right], the minimum lies in the right half → move left to mid + 1.
//     - If nums[mid] < nums[right], the minimum lies in the left half (including mid) → move right to mid.
//     - If equal, decrement right to safely shrink the search space (cannot determine side due to duplicates).
//   Continue until left == right; that index holds the minimum.
// Time Complexity: O(log n) average, O(n) worst case (when many duplicates)
// Space Complexity: O(1)

class Solution 
{
    public int findMin(int[] nums) 
    {
        int left = 0;
        int right = nums.length-1;

        while(left<right)
        {
            int mid = left + (right-left)/2;

            if(nums[mid]>nums[right])
                left = mid+1;
            else if(nums[mid]<nums[right])
                right = mid;
            else
                right--;
        }   
        return nums[left];
    }
}
