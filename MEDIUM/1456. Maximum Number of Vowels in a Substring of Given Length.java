// Problem: 1456. Maximum Number of Vowels in a Substring of Given Length
// Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// Approach: Use a sliding window of size k to count vowels in the current window.  
//           Move the window forward by removing the effect of the leftmost character  
//           and adding the next character. Keep track of the maximum vowel count found.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution
{
    public int maxVowels(String s, int k) 
    {
        int currVowelCount = 0, maxVowelCount = 0;

        for (int i = 0; i < k; i++) 
        {
            if (isVowel(s.charAt(i))) currVowelCount++;
        }
        maxVowelCount = currVowelCount;

        for (int i = k; i < s.length(); i++) 
        {
            if (isVowel(s.charAt(i - k))) currVowelCount--;
            if (isVowel(s.charAt(i))) currVowelCount++;    
            maxVowelCount = Math.max(maxVowelCount, currVowelCount);
        }
        return maxVowelCount;
    }

    private boolean isVowel(char c) 
    {
        return "aeiou".indexOf(c) != -1;
    }
}
