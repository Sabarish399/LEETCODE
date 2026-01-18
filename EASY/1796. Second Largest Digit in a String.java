// Problem: 1796. Second Largest Digit in a String
// Link: https://leetcode.com/problems/second-largest-digit-in-a-string/
// Approach:
//   Iterate digits from '9' down to '0'.
//   For each digit, check if it appears in the string using indexOf.
//   Decrement a counter when a digit is found.
//   When the second distinct digit is found, return it.
//   If fewer than two distinct digits exist, return -1.
// Time Complexity: O(10 * n) → O(n)
// Space Complexity: O(1)

class Solution 
{
    public int secondHighest(String s) 
    {
        int count = 2;

        for(char c='9';c>='0';c--)
            if(s.indexOf(c) != -1)
                if(--count == 0)
                    return c -'0';
        return -1;
    }
}
