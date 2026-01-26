// Problem: 713. Subarray Product Less Than K
// Link: https://leetcode.com/problems/subarray-product-less-than-k/
// Approach:
//   Use the sliding window technique.
//   Maintain a window [j, i] with product < k.
//   Expand the window by multiplying nums[i].
//   While product >= k, shrink the window from the left by dividing nums[j].
//   For each index i, the number of valid subarrays ending at i is (i - j + 1).
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        if(k<=1) return 0;

        int count=0;
        int j=0;
        int product = 1;

        for(int i=0;i<nums.length;i++)
        {
            product *= nums[i];
            while(product>=k)
                product /= nums[j++];

            count += i - j + 1;
        }
        return count;
    }
}
