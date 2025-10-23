// Problem: 2390. Removing Stars From a String
// Link: https://leetcode.com/problems/removing-stars-from-a-string/
// Approach:
// - Use a StringBuilder to simulate a stack.
// - Iterate through each character:
//     - If the character is '*', remove the last added character (pop operation).
//     - Otherwise, append the character to the StringBuilder.
// - Finally, return the resulting string.
// Time Complexity: O(n) — each character is processed once.
// Space Complexity: O(n) — for the StringBuilder storage.

class Solution 
{
    public String removeStars(String s) 
    {
        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray())
        {
            if(c == '*') sb.deleteCharAt(sb.length()-1);
            else sb.append(c);
        }
        return sb.toString();
    }
}
