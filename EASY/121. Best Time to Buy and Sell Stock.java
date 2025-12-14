// Problem: 121. Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Approach:
//   Greedy single-pass solution.
//   Track the minimum price seen so far.
//   At each step, compute the profit if sold today and update the maximum profit.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices)
        {
            if(price < minPrice) minPrice = price;
            else maxProfit = Math.max(maxProfit,price-minPrice);
        }
        return maxProfit;
    }
}
