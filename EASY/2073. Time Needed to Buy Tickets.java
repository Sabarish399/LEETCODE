// Problem: 2073. Time Needed to Buy Tickets
// Link: https://leetcode.com/problems/time-needed-to-buy-tickets/
//
// Approach:
// - Every person before or at index k can buy tickets at most tickets[k] times.
// - Every person after index k gets one less chance because the process stops
//   immediately after person k buys their last ticket.
// - For each person:
//     • If i <= k, add min(tickets[i], tickets[k]).
//     • Otherwise, add min(tickets[i], tickets[k] - 1).
// - The accumulated value is the total time required.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        int res = 0;
        for(int i=0;i<tickets.length;i++)
        {
            if(i <= k) res += Math.min(tickets[i],tickets[k]);
            else res += Math.min(tickets[i],tickets[k]-1);

        }
        
        return res;
    }
}
