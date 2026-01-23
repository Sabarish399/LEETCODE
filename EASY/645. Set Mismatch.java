// Problem: 645. Set Mismatch
// Link: https://leetcode.com/problems/set-mismatch/
// Approach:
//   Use the array itself as a marker by negating values at indices.
//   For each number x, map it to index x - 1.
//     - If nums[x - 1] is already negative, x is the duplicated number.
//     - Otherwise, negate nums[x - 1] to mark it as seen.
//   In a second pass, the index i where nums[i] remains positive
//   corresponds to the missing number (i + 1).
// Time Complexity: O(n)
// Space Complexity: O(1) — ignoring output array

class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int dup = -1;
        int miss = 1;

        for(int i=0;i<nums.length;i++)
        {
            int idx = Math.abs(nums[i])-1;

            if(nums[idx] < 0)
                dup = idx+1;
            else
                nums[idx] = -nums[idx];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                miss = i+1;
                break;
            }
        }

        return new int[]{dup,miss};
    }
}
