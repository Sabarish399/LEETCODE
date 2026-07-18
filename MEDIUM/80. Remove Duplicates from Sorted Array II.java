// Problem: 80. Remove Duplicates from Sorted Array II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//
// Approach:
// - Maintain a write pointer representing the length of the valid array.
// - Start from the third element since the first two elements are always allowed.
// - For each element, compare it with the element two positions before the write pointer.
// - If they are different, place the current element at the write pointer and increment it.
// - Return the final length of the modified array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int max = 2;
        
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i] != nums[max-2])
            {
                nums[max] = nums[i];
                max++;
            }
        }
        return max;
    }
}
