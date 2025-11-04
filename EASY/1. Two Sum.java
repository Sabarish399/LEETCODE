// Problem: 1. Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Approach:
// - Use a **HashMap** to store each number’s value and its corresponding index.
// - For each element in the array:
//     • Compute the complement (`target - nums[i]`).
//     • Check if the complement exists in the map — if yes, return the two indices.
//     • Otherwise, add the current number and its index to the map.
// - This approach avoids nested loops, reducing time complexity.
//
// Time Complexity: O(n) — each element is processed once.
// Space Complexity: O(n) — for storing elements in the HashMap.

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
         Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) 
        {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) 
            {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{}; 
    }
}
