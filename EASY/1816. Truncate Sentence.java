// Problem: 1816. Truncate Sentence
// Link: https://leetcode.com/problems/truncate-sentence/
// Approach:
//   Traverse the string character by character while counting spaces.
//   Each space indicates the end of a word.
//   When k words have been counted, return the substring up to the previous character.
//   If the string has fewer than k spaces, return the entire string.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public String truncateSentence(String s, int k) 
    {
        int i=0;
        while(i<s.length())
        {
            if(k==0) return s.substring(0,i-1);
            if(s.charAt(i)==' ') k--;
            i++;
        }
        return s;
    }
}
