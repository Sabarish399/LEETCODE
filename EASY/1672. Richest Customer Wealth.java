// Problem: 1672. Richest Customer Wealth
// Link: https://leetcode.com/problems/richest-customer-wealth/
// Approach: Calculate row sum for each customer, track the maximum.
// Time Complexity: O(m*n)
// Space Complexity: O(1)

class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        
        int richAll = 0,rich=0;
        for(int[] i:accounts)
        {
            for(int j:i)
            {
                rich+=j;
            }
            if(rich>richAll)
                richAll = rich;
            rich =0;
        }

        return richAll;
    }
}
