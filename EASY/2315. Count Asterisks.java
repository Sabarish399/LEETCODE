// Problem: 2315. Count Asterisks
// Link: https://leetcode.com/problems/count-asterisks/
//
// Approach:
// - Traverse the string character by character.
// - Count the number of '|' characters encountered to determine whether the
//   current position is inside or outside a pair of vertical bars.
// - Count an asterisk only when the number of encountered '|' characters is even,
//   meaning it lies outside any pair of bars.
// - Return the total number of valid asterisks.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int countAsterisks(String s) 
    {
        int count = 0;
        int res = 0;
        for(char c : s.toCharArray())
        {
            if(c == '|') count++;
            if(count % 2 == 0 && c == '*')  res++;
        }
        return res;
    }
}
