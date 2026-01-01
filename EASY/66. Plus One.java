// Problem: 66. Plus One
// Link: https://leetcode.com/problems/plus-one/
// Approach:
//   Handle addition from the least significant digit.
//   If the last digit is not 9, increment and return immediately.
//   Otherwise, propagate the carry by setting trailing 9s to 0 until a non-9 digit is found.
//   If all digits are 9, create a new array with an extra leading 1.
// Time Complexity: O(n)
// Space Complexity: O(1) (O(n) only in the all-9s case due to new array creation)

class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        if(digits[digits.length-1] != 9)
        {
            digits[digits.length-1] += 1;
            return digits; 
        }

        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i] != 9) 
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
