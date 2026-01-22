// Problem: 2485. Find the Pivot Integer
// Link: https://leetcode.com/problems/find-the-pivot-integer/
// Approach:
//   Let the pivot be x such that:
//     sum(1 to x) = sum(x to n)
//   This implies:
//     x^2 = n * (n + 1) / 2
//   Compute the total sum, take its square root, and check
//   if it is a perfect square. If yes, return x; otherwise, return -1.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public int pivotInteger(int n) 
    {
        int total = n*(n+1)/2;
        int x = (int) Math.sqrt(total);
        return x * x == total ? x : -1;
    }
}
