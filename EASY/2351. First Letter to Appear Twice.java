// Problem: 2351. First Letter to Appear Twice
// Link: https://leetcode.com/problems/first-letter-to-appear-twice/
// Approach:
//   Use a boolean array of size 26 to track whether a character has been seen before.
//   Iterate through the string from left to right.
//   For each character:
//     - If it is already marked as visited, return it immediately.
//     - Otherwise, mark it as visited.
//   The problem guarantees that a repeated character exists.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public char repeatedCharacter(String s) 
    {
        /*Set<Character> visited = new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            if(visited.contains(s.charAt(i))) return s.charAt(i);

            visited.add(s.charAt(i));
        }
        return ' ';*/

        boolean[] visited = new boolean[26];

        for(int i=0;i<s.length();i++)
        {
            if(visited[s.charAt(i) - 'a']) return s.charAt(i);

            visited[s.charAt(i) - 'a'] = true;
        }
        return ' ';
    }
}
