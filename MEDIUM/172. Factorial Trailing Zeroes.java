// Problem: 172. Factorial Trailing Zeroes
// Link: https://leetcode.com/problems/factorial-trailing-zeroes/
// Approach:
//   Trailing zeros come from factors of 10, which are formed by pairs of (2, 5).
//   Since there are more factors of 2 than 5 in factorials, count the number of factors of 5.
//   Repeatedly divide n by 5 and accumulate the quotients.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int trailingZeroes(int n) 
    {
        int count = 0;
        while(n > 0)
        {
            n /= 5;
            count += n;
        }
        return count;
    }
}
