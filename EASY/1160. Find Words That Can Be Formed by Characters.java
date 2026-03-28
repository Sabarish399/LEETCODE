// Problem: 1160. Find Words That Can Be Formed by Characters
// Link: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
//
// Approach:
// - Count frequency of characters in `chars` using an array.
// - For each word:
//     • Clone the base frequency array.
//     • For each character in the word:
//         - If frequency is 0 → cannot form → mark invalid.
//         - Otherwise decrement frequency.
//     • If valid, add word length to result.
// - Return total length.
//
// Time Complexity: O(n * k)
//     - n = number of words
//     - k = average word length
// Space Complexity: O(1)

class Solution 
{
    public int countCharacters(String[] words, String chars) 
    {        
        int[] freq = new int[26];
        for(char c:chars.toCharArray())
            freq[c-'a']++;

        int length = 0;
        for(String s : words)
        {
            int[] copy = freq.clone();
            boolean valid = true;
            for(char c:s.toCharArray())
            {
                if(copy[c-'a'] < 1)
                {
                    valid = false;
                    break;
                }
                copy[c-'a']--;
            }
            if(valid) length += s.length();
        }
        return length;
    }
}
