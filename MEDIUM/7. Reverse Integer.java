// Problem: 7. Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/
// Approach: Extract digits using modulo and build the reversed number using multiplication by 10.
//           Before every push, check for overflow against 32-bit signed integer limits.
// Time Complexity: O(log n) — number of digits
// Space Complexity: O(1)

class Solution 
{
    public int reverse(int x) 
    {
        int rem = 0,res = 0;

        while(x != 0)
        {
            rem = x%10;
            x = x/10;

            if (res > Integer.MAX_VALUE/10||res < Integer.MIN_VALUE/10) return 0;
            res = res * 10 + rem;
        }
        return res;
    }
}
