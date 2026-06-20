// Problem: 1897. Redistribute Characters to Make All Strings Equal
// Link: https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
//
// Approach:
// - Count the frequency of every character across all strings.
// - For each character, check whether its frequency is divisible by the
//   total number of strings.
// - If any character frequency is not divisible, equal redistribution is
//   impossible.
// - Otherwise, all characters can be evenly distributed among the strings.
//
// Time Complexity: O(T)
//     - T = total number of characters across all strings
// Space Complexity: O(1)

class Solution 
{
    public boolean makeEqual(String[] words) 
    {
        int[] freq = new int[26];

        for(String s:words)
        {
            for(char c:s.toCharArray())
            {
                freq[c-'a']++;
            }
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i] % words.length != 0) return false;
        }

        return true;
    }
}  
