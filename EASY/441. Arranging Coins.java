// Problem: 441. Arranging Coins
// Link: https://leetcode.com/problems/arranging-coins/
//
// Approach (Binary Search):
// - We need the largest k such that:
//     k * (k + 1) / 2 <= n
// - Use binary search on k in range [0, n]:
//     • Compute mid and coins = mid * (mid + 1) / 2
//     • If coins == n → return mid
//     • If coins < n → move left = mid + 1
//     • Else → move right = mid - 1
// - When loop ends, right holds the largest valid k.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int arrangeCoins(int n) 
    {
        long left = 0, right = n;

        while(left<=right)
        {
            long mid = left + (right-left)/2;

            long coins = mid*(mid+1)/2;

            if(coins == n) return (int) mid;
            else if(coins < n) left = mid+1;
            else right = mid-1;
        }
        return (int) right;
    }
}
