// Problem: 238. Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self/
// Approach: Use two passes to calculate prefix and suffix products. 
//           First pass: store prefix product in res[i] (product of all elements before i). 
//           Second pass: multiply res[i] with suffix product (product of all elements after i). 
//           This avoids division and achieves O(1) extra space (excluding output array).
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), excluding the output array.

class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int[] res= new int[n];

        res[0]=1;
        for(int i=1;i<n;i++)
        {
            res[i] = res[i-1]*nums[i-1];
        }

        int right = 1;
        for(int i=n-1;i>=0;i--)
        {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
