// Problem: 3379. Construct Transformed Array
// Link: https://leetcode.com/problems/construct-transformed-array/
// Approach:
//   For each index i, move nums[i] steps forward (or backward if negative)
//   in a circular manner over the array.
//   Use modulo arithmetic to correctly wrap indices, including negative shifts:
//       newIndex = ((i + nums[i]) % n + n) % n
//   Assign result[i] = nums[newIndex].
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int[] constructTransformedArray(int[] nums) 
    {
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0;i<nums.length;i++)
        {
            result[i] = nums[((i+nums[i])%n+n)%n];
        }
        return result;
    }
}
