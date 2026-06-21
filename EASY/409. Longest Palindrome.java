// Problem: 409. Longest Palindrome
// Link: https://leetcode.com/problems/longest-palindrome/
//
// Approach:
// - Count the frequency of each character.
// - For every character, add the largest even count that can be used in
//   the palindrome, i.e., (freq / 2) * 2.
// - If any character has an odd frequency, one occurrence can be placed
//   at the center of the palindrome.
// - Return the total length formed by paired characters plus one center
//   character if available.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int longestPalindrome(String s) 
    {
        int[] freq = new int[128];

        for(char c:s.toCharArray())
        {
            freq[c]++;
        }

        int count = 0;
        boolean single = false;
        for(int i=0;i<128;i++)
        {
            count += (freq[i]/2)*2;

            if(freq[i]%2 == 1) single = true;
        }

        return single ? count+1 : count;
    }
}
