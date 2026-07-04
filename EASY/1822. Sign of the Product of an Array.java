// Problem: 1822. Sign of the Product of an Array
// Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/
//
// Approach:
// - Traverse the array without computing the actual product.
// - If any element is 0, the product is 0, so return 0 immediately.
// - Keep track of the product's sign by flipping it whenever a negative
//   number is encountered.
// - Return the final sign after processing all elements.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int arraySign(int[] nums) 
    {
        int product = 1;

        for(int num : nums)
        {
            if(num == 0) return 0;
            else if(num < 0) product *= -1;
        }
        return product;
    }
}
