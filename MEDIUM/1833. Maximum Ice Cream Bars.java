// Problem: 1833. Maximum Ice Cream Bars
// Link: https://leetcode.com/problems/maximum-ice-cream-bars/
//
// Approach:
// - Sort the ice cream costs in ascending order.
// - Buy the cheapest ice cream bars first to maximize the number purchased.
// - For each cost:
//     • If enough coins are available, buy it and subtract its cost.
//     • Otherwise, stop.
// - The number of bars bought is the answer.
//
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution 
{
    public int maxIceCream(int[] costs, int coins) 
    {
        Arrays.sort(costs);

        int i;
        for(i=0;i<costs.length;i++)
        {
            if(coins >= costs[i]) coins -= costs[i];
            else break;
        }
        return i;
    }
}
