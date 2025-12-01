// Problem: 58. Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/
// Approach: Trim trailing spaces, then iterate from the end and count characters
// of the last word without creating extra arrays. This avoids overhead of split().
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int i = s.length()-1;

        while(i>=0 && s.charAt(i)==' ') i--;
        int len = 0;
        while(i>=0 && s.charAt(i) != ' ')
        {
            len++;
            i--;
        }
        return len;
    }
}
