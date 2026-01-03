// Problem: 1929. Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/
// Approach:
//   Create a new array of size 2 * n.
//   Copy the original array into the first half and again into the second half.
//   Use System.arraycopy for efficient copying.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int n = nums.length;
        
        int[] ans = new int[nums.length*2];

        // for(int i=0;i<n;i++)
        // {
        //     ans[i] = nums[i];
        //     ans[i+n] = nums[i];
        // }
        // return ans;
        
        System.arraycopy(nums,0,ans,0,n);
        System.arraycopy(nums,0,ans,n,n);
        return ans;
    }
}
