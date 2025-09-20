// Problem: 50. Pow(x, n)
// Link: https://leetcode.com/problems/powx-n/
// Approach: Use fast exponentiation (binary exponentiation). 
//           Convert negative exponents by taking reciprocal and making power positive. 
//           Multiply result when the current power bit is set, and square the base each step.
// Time Complexity: O(log n), since we halve the exponent in each iteration.
// Space Complexity: O(1), using only constant extra space.

class Solution 
{
    public double myPow(double x, int n) 
    {
        long N =n;
        if(N<0)
        {
            x = 1/x;
            N=-N;
        }
        
        double res=1.0;
        while(N>0)
        {
            if(N%2==1)
                res *=x;
            x*=x;
            N/=2;
        }

        return res;
    }
}
