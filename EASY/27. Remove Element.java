// Problem: 27. Remove Element
// Link: https://leetcode.com/problems/remove-element/
// Approach: Use two pointers. Iterate through the array and copy elements 
//           that are not equal to val into the front. Return the new length.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
