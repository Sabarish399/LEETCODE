// Problem: 442. Find All Duplicates in an Array
// Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Approach:
//   Use the array itself as a marker by leveraging the constraint that
//   numbers are in the range [1, n].
//   For each number x, map it to index x - 1.
//   - If nums[x - 1] is already negative, x is a duplicate.
//   - Otherwise, negate nums[x - 1] to mark it as seen.
// Time Complexity: O(n)
// Space Complexity: O(1) — ignoring the output list

class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int idx = Math.abs(nums[i])-1;

            if(nums[idx]<0) list.add(idx+1);
            else nums[idx] = -nums[idx];
        }
        return list;
    }
}
