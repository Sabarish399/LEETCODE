// Problem: 3904. Concatenate Non-Zero Digits and Multiply by Sum I
// Link: https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/
//
// Approach:
// - Traverse the digits of the given number from right to left.
// - Ignore any digit equal to 0.
// - Build a new number by concatenating all non-zero digits while preserving
//   their original order.
// - Simultaneously compute the sum of the non-zero digits.
// - Return the product of the newly formed number and the sum of its digits.
//
// Time Complexity: O(d)
//     - d = number of digits in n
// Space Complexity: O(1)

class Solution 
{
    public long sumAndMultiply(int n) 
    {
        int x = 0;
        int sum = 0;
        int i=1;

        while(n > 0)
        {
            int rem = n%10;

            if(rem != 0)
            {
                x = x + (rem*i);
                sum += rem;
                i *= 10;
            }
            n /= 10;
        }
        return (long)x*sum;
    }
}
