// Problem: 1913. Maximum Product Difference Between Two Pairs
// Link: https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
//
// Approach:
// - We need two largest and two smallest numbers.
// - Traverse the array once:
//     • Track max1, max2 (largest and second largest)
//     • Track min1, min2 (smallest and second smallest)
// - Update values dynamically while iterating.
// - Compute result:
//     • (max1 * max2) - (min1 * min2)
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxProductDifference(int[] nums) 
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i:nums)
        {
            if(i > max1)
            {
                max2 = max1;
                max1 = i;
            }
            else if(i > max2) max2 = i;

            if(i < min1)
            {
                min2 = min1;
                min1 = i;
            }
            else if(i < min2) min2 = i;
        }
        return (max1*max2) - (min1*min2);
    }
}
