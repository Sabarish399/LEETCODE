// Problem: 3614. Process String with Special Operations II
// Link: https://leetcode.com/problems/process-string-with-special-operations-ii/
//
// Approach:
// - First, compute the length of the final processed string without actually
//   constructing it by simulating the operations.
// - If k is greater than or equal to the final length, return '.'.
// - Traverse the original string in reverse to undo each operation:
//     • '*' : restore one deleted character by increasing the length.
//     • '#' : map k to the corresponding half and halve the length.
//     • '%' : reverse the index using k = len - 1 - k.
//     • Letter : if it corresponds to the required index, return it;
//       otherwise decrease the current length.
// - Return the character found after reversing all operations.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public char processStr(String s, long k) 
    {
        long len = 0;

        for(char c:s.toCharArray())
        {
            if(c == '*') len = Math.max(0,len-1);
            else if(c == '#') len *= 2;
            else if(c != '%') len++;
        }

        if(k >= len) return '.';

        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);

            if(c == '*')
            {
                len++;
            }
            else if(c == '#')
            {
                if(k >= len/2) k -= len/2;
                len /= 2;
            }
            else if(c == '%')
            {
                k = len - 1 - k;
            }
            else
            {
                if(k == len-1) return c;
                len--;
            }
        }
        return '.';
    }
}
