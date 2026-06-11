  // Problem: 525. Contiguous Array
// Link: https://leetcode.com/problems/contiguous-array/
//
// Approach:
// - Traverse the array while maintaining a running count.
// - Treat 0 as +1 and 1 as -1.
// - If the same count is seen again, the subarray between the two indices
//   has an equal number of 0s and 1s.
// - Store the first occurrence of each count in a HashMap and update the
//   maximum subarray length whenever a repeated count is found.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int findMaxLength(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int maxLen = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0) count += 1;
            else count -= 1;

            if(map.containsKey(count))
            {
                maxLen = Math.max(maxLen, i - map.get(count)); 
            }
            else map.put(count,i);
        }
        return maxLen;
    }
}
