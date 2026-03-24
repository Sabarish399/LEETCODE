// Problem: 896. Monotonic Array
// Link: https://leetcode.com/problems/monotonic-array/
//
// Approach:
// - Use two flags:
//     • inc → true if any increasing pair found
//     • dec → true if any decreasing pair found
// - Traverse array from index 1:
//     • If nums[i] > nums[i-1], mark inc = true.
//     • If nums[i] < nums[i-1], mark dec = true.
//     • If both inc and dec become true → return false.
// - If loop completes, array is monotonic → return true.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        boolean inc = false;
        boolean dec = false;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                inc = true;
                if(dec==true) return false;
            }
            else if(nums[i-1]>nums[i])
            {
                dec = true;
                if(inc==true) return false;
            }
        }
        return true;
    }
}
