// Problem: 1684. Count the Number of Consistent Strings
// Link: https://leetcode.com/problems/count-the-number-of-consistent-strings/
//
// Approach:
// - Create a boolean array to mark allowed characters.
// - For each word:
//     • Check every character.
//     • If any character is not allowed → mark invalid.
// - Count all valid words.
//
// Time Complexity: O(n * k)
//     - n = number of words
//     - k = average word length
// Space Complexity: O(1)

class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        boolean[] contains = new boolean[26];

        for(char c: allowed.toCharArray()) contains[c-'a'] = true;
        
        int count = 0;

        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            boolean valid = true;
            for(char c:word.toCharArray())
            {
                if(!contains[c-'a'])
                {
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }
}
