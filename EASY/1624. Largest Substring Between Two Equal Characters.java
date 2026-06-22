// Problem: 1624. Largest Substring Between Two Equal Characters
// Link: https://leetcode.com/problems/largest-substring-between-two-equal-characters/
//
// Approach:
// - Store the first occurrence index of each character.
// - Traverse the string:
//     • If the character is seen for the first time, record its index.
//     • Otherwise, compute the length between the current index and its
//       first occurrence, excluding both characters.
// - Keep track of the maximum such length.
// - Return the maximum length found, or -1 if no character repeats.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxLengthBetweenEqualCharacters(String s) 
    {
        int[] idx = new int[26];
        Arrays.fill(idx,-1);

        int max = -1;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(idx[c-'a'] == -1) idx[c-'a'] = i;
            else max = Math.max(max,i-idx[c-'a']-1);
        }
        
        return max;
    }
}
