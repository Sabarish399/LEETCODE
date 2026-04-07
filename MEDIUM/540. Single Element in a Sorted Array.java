// Problem: 540. Single Element in a Sorted Array
// Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
//
// Approach (Binary Search with Parity Normalization):
// - In a sorted array with pairs + one single:
//     • Before the single → pairs start at even indices
//     • After the single → pairs shift (start at odd indices)
// - Use binary search on indices:
//     • Compute mid
//     • Force mid to be even (if odd → mid--)
//     • If nums[mid] == nums[mid+1]:
//         - Pair is valid → single lies to the right → left = mid + 2
//     • Else:
//         - Pair is broken → single is at mid or left side → right = mid
// - Loop ends when left == right → return nums[left]
//
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int left = 0;
        int right = nums.length-1;

        while(left<right)
        {
            int mid = left + (right - left) / 2;

            if( (mid&1) == 1 ) mid--;
            if(nums[mid] == nums[mid+1]) left = mid+2;
            else right = mid;
        }
        return nums[left];
    }
}
