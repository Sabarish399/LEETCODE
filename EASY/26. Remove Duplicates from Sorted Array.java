// Problem: 26. Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: Two-pointer method. Keep one pointer for unique elements and 
//           copy non-duplicate values in place. Return the new length.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) 
        {
            if (nums[j] != nums[i]) 
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
