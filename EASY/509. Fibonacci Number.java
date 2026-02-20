// Problem: 509. Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/
//
// Approach (Iterative DP - Space Optimized):
// - If n < 2, return n directly.
// - Maintain two variables:
//     • a = F(0)
//     • b = F(1)
// - Iterate from 2 to n:
//     • c = a + b
//     • a = b
//     • b = c
// - Return b.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int fib(int n) 
    {
        if(n<2) return n;

        int a = 0;
        int b = 1;

        for(int i=2;i<=n;i++)
        {
            int c = a+b;
            a = b;
            b = c;
        }

        return b;
    }
}
