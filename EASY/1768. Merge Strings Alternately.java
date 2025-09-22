// Problem: 1768. Merge Strings Alternately
// Link: https://leetcode.com/problems/merge-strings-alternately/
// Approach: Use two pointers to traverse both strings simultaneously. 
//           Append characters alternately until one string is exhausted, 
//           then append the remaining characters of the longer string.
// Time Complexity: O(m + n), where m and n are lengths of word1 and word2.
// Space Complexity: O(m + n), for storing the merged string in StringBuilder.

class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder strBuild = new StringBuilder();

        int i=0,j=0;
        while(word1.length()>i && word2.length()>j)
        {
            strBuild.append(word1.charAt(i++));
            strBuild.append(word2.charAt(j++));
        }

        while(word1.length()>i)
        {
            strBuild.append(word1.charAt(i++));
        }

        while(word2.length()>j)
        {
            strBuild.append(word2.charAt(j++));
        }
        return strBuild.toString();
    }
}
