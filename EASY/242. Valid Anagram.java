// Problem: 242. Valid Anagram
// Link: https://leetcode.com/problems/valid-anagram/
//
// Approach:
// - If lengths differ → cannot be anagrams.
// - Use a frequency array of size 26.
// - Traverse string s:
//     • Increment frequency for each character.
// - Traverse string t:
//     • Decrement frequency for each character.
// - If all frequencies become 0 → strings are anagrams.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;

        for(int i=0;i<t.length();i++)
            freq[t.charAt(i)-'a']--;

        for(int i=0;i<26;i++)
        {
            if(freq[i] != 0) return false;
        }

        return true;
    }
}
