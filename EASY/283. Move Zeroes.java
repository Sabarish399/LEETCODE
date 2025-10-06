// Problem: 283. Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Approach: Use two pointers.  
//           One pointer (`j`) keeps track of the position to insert the next non-zero element.  
//           Traverse the array and move all non-zero elements forward.  
//           After traversal, fill the remaining positions with zeros.
// Time Complexity: O(n) — single pass through the array.
// Space Complexity: O(1) — in-place operation.

class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[j++]=nums[i];
        }
        while(j<nums.length)
            nums[j++]=0;
    }
}
