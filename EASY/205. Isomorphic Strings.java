// Problem: 205. Isomorphic Strings
// Link: https://leetcode.com/problems/isomorphic-strings/
// Approach:
//   Use two index-mapping arrays to track the last seen positions of characters in both strings.
//   For each position i:
//     - If the last seen index of s[i] does not match that of t[i], the mapping is inconsistent.
//     - Update both arrays with the current position (i + 1 to avoid default zero conflict).
//   If all positions are consistent, the strings are isomorphic.
// Time Complexity: O(n)
// Space Complexity: O(1) — fixed-size arrays

class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {        
        int[] sIdx = new int[200];
        int[] tIdx = new int[200];

        for(int i=0;i<s.length();i++)
        {
            if(sIdx[s.charAt(i)] != tIdx[t.charAt(i)]) return false;

            sIdx[s.charAt(i)] = i+1;
            tIdx[t.charAt(i)] = i+1;
        }
        return true;
    }
}
