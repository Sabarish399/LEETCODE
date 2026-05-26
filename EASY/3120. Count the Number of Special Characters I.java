// Problem: 3120. Count the Number of Special Characters I
// Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/
//
// Approach:
// - Use a boolean array of size 52:
//     • indices 0–25   → lowercase letters
//     • indices 26–51  → uppercase letters
// - Traverse the string:
//     • Mark lowercase and uppercase occurrences separately.
// - Count characters where both lowercase and uppercase exist.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int numberOfSpecialChars(String word) 
    {
        boolean freq[] = new boolean[52];

        int count = 0;
        for(char c:word.toCharArray())
        {
            if(Character.isUpperCase(c))
                freq[c-'A' + 26] = true;
            else 
                freq[c-'a'] = true;
        }

        for(int i=0;i<freq.length/2;i++)
        {
            if(freq[i] && freq[i+26]) count++;
        }
        return count;
    }
}
