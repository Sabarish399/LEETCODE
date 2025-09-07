// Problem: 413. Arithmetic Slices
// Link: https://leetcode.com/problems/arithmetic-slices/
// Approach: Traverse the array and check if consecutive differences match. Use a counter (curr) to keep track of slices ending at each index and add to the result.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int numberOfArithmeticSlices(int[] nums) 
    {
        int n = nums.length;
        if (n < 3) return 0;

        int ans = 0;
        int curr = 0;

        for (int i = 2; i < n; i++) 
        {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr += 1;     
                ans += curr;   
            } else {
                curr = 0;      
            }
        }
        return ans;
    }
}
