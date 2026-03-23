// Problem: 1752. Check if Array Is Sorted and Rotated
// Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
//
// Approach:
// - Count the number of "drops" where nums[i-1] > nums[i].
// - Traverse from index 1 to n-1:
//     • If nums[i-1] > nums[i], increment count.
// - Also check circular condition:
//     • If last element > first element → increment count.
// - If total drops ≤ 1 → array is sorted and rotated.
// - Otherwise → return false.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean check(int[] nums) 
    {
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1] > nums[i]) count++;
        }
        if(nums[nums.length-1] > nums[0]) count++;
        return count<=1;
    }
}
