// Problem: 136. Single Number
// Link: https://leetcode.com/problems/single-number/
// Approach:
//   Use XOR properties:
//     - a ^ a = 0
//     - a ^ 0 = a
//   XOR all elements together; duplicates cancel out,
//   leaving the unique element.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int res = 0;
        for(int i:nums) res ^= i;
        
        return res;
    }
}
