// Problem: 2460. Apply Operations to an Array
// Link: https://leetcode.com/problems/apply-operations-to-an-array/
//
// Approach:
// - First pass:
//     • If two adjacent elements are equal:
//         - Double the left element.
//         - Set the right element to 0.
// - Second pass:
//     • Move all non-zero elements to the front.
// - Fill remaining positions with 0.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int[] applyOperations(int[] nums) 
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] *= 2;
                nums[i+1] = 0; 
            }
        }

        int i = 0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] != 0) nums[i++] = nums[j]; 
        }

        while(i<nums.length)
        {
            nums[i++] = 0;
        }
        return nums;
    }
}
