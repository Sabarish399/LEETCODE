// Problem: 3338. Trionic Array
// Link: https://leetcode.com/problems/trionic-array/
// Approach:
//   A trionic array must strictly follow three consecutive phases:
//     1) Strictly increasing
//     2) Strictly decreasing
//     3) Strictly increasing
//   Traverse the array using a pointer:
//     - First, move while elements are increasing.
//     - Then, move while elements are decreasing.
//     - Finally, move while elements are increasing again.
//   Each phase must be non-empty, and the traversal must end exactly at the last index.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean isTrionic(int[] nums) 
    {
        int n = nums.length;
        if(n<4) return false;

        int i=0;

        while(i+1 < n && nums[i]<nums[i+1]) i++;
        if(i==0 || i==n-1) return false;

        int p=i;

        while(i+1 < n && nums[i]>nums[i+1]) i++;
        if(i==p || i==n-1) return false;

        while(i+1 < n && nums[i]<nums[i+1]) i++;

        return i==n-1;
    }
}
