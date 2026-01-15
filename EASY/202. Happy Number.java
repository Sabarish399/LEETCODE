// Problem: 202. Happy Number
// Link: https://leetcode.com/problems/happy-number/
// Approach:
//   Use recursion based on the observation that all unhappy numbers
//   eventually fall into a cycle that does not include 1.
//   Base cases:
//     - If n == 1 or n == 7, the number is happy.
//     - If n < 10 and not 1 or 7, it will never reach 1 → unhappy.
//   Otherwise, replace n with the sum of squares of its digits and recurse.
// Time Complexity: O(log n) per recursion, converges quickly
// Space Complexity: O(log n) due to recursion stack

class Solution 
{
    public boolean isHappy(int n) 
    {
        if(n==1||n==7) return true;
        else if(n<10) return false;
        int sum = 0;
        while(n!=0)
        {
            sum += (n%10)*(n%10);
            n /= 10;
        }
        return isHappy(sum);
    }
}
