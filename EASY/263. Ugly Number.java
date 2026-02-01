// Problem: 263. Ugly Number
// Link: https://leetcode.com/problems/ugly-number/
// Approach:
//   An ugly number has no prime factors other than 2, 3, and 5.
//   Repeatedly divide n by 2, 3, and 5 while it is divisible.
//   After removing all such factors, if the remaining value is 1,
//   then n is an ugly number.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public boolean isUgly(int n) 
    {
        if(n<=0) return false;

        while(n%2 == 0)
            n /= 2;
        while(n%3 == 0)
            n /= 3;
        while(n%5 == 0)
            n /= 5;

        return n==1;  
    }
}
