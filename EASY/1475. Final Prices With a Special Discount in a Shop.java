// Problem: 1475. Final Prices With a Special Discount in a Shop
// Link: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
//
// Approach (Monotonic Stack):
// - Use a stack to store indices of prices.
// - Traverse the array from left to right.
// - For each index i:
//     • While stack is not empty AND prices[i] <= prices[stack.peek()]:
//         - Pop the index from stack.
//         - Apply discount: prices[index] -= prices[i].
//     • Push current index i onto the stack.
// - Remaining indices in stack have no discount.
// - Return modified prices array.
//
// Time Complexity: O(n) — each index is pushed and popped at most once.
// Space Complexity: O(n) — stack may hold up to n indices.

class Solution 
{
    public int[] finalPrices(int[] prices) 
    {
        int n = prices.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++)
        {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()])
            {
                int index = stack.pop();
                prices[index] -= prices[i];
            }
            stack.push(i);
        }

        return prices;
    }
}
