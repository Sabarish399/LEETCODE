// Problem: 2483. Minimum Penalty for a Shop
// Link: https://leetcode.com/problems/minimum-penalty-for-a-shop/
// Approach:
//   Model the penalty change as a prefix sum problem.
//   Treat:
//     - 'Y' as -1 (penalty decreases if shop is open and customer comes)
//     - 'N' as +1 (penalty increases if shop is open and no customer comes)
//   Traverse the string and maintain a running prefix sum.
//   The index where the prefix sum reaches its minimum gives the optimal closing time.
//   Edge cases:
//     - All 'Y' → close after last hour
//     - All 'N' → close immediately
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int bestClosingTime(String customers) 
    {
        if(!customers.contains("N")) return customers.length();
        if(!customers.contains("Y")) return 0;

        int min = 0;
        int prefixSum = 0;
        int bestTime = 0;

        for(int i=0;i<customers.length();i++)
        {
            prefixSum += customers.charAt(i) == 'Y' ? -1 : 1;

            if(prefixSum < min)
            {
                bestTime = i+1;
                min = prefixSum;
            }
        }
        return bestTime; 
    }
}
