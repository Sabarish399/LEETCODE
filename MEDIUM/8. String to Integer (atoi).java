// Problem: 8. String to Integer (atoi)
// Link: https://leetcode.com/problems/string-to-integer-atoi/
// Approach: 
//   1. Skip leading spaces.
//   2. Capture optional sign.
//   3. Parse digits while preventing 32-bit overflow by using a long.
//   4. Clamp the result if it exceeds INT_MAX or INT_MIN.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int myAtoi(String s) 
    {
        int curr = 0;

        while(curr < s.length() && s.charAt(curr) == ' ') curr++;

        if(curr == s.length()) return 0;

        int sign = 1;
        if(s.charAt(curr) == '+') curr++;
        else if(s.charAt(curr) == '-') 
        {
            sign = -1;
            curr++;
        }

        long res = 0;
        while(s.length() > curr && Character.isDigit(s.charAt(curr)))
        {
            int digit = s.charAt(curr) - '0';
            res = res * 10 + digit;
            curr++;

            if(res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(res*sign);
    }
}
