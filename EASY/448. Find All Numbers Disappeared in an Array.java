// Problem: 448. Find All Numbers Disappeared in an Array
// Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Approach:
//   Use the array itself as a marker since values are in the range [1, n].
//   For each number x, map it to index x - 1 and mark nums[x - 1] as negative.
//   After marking, any index i with a positive value means (i + 1) never appeared.
// Time Complexity: O(n)
// Space Complexity: O(1) — ignoring the output list

class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]>0)
                nums[idx] *= -1;
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0)
                list.add(i+1);
        }
        return list;
    }
}
