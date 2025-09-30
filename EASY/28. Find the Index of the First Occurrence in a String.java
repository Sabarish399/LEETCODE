// Problem: 28. Find the Index of the First Occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Approach: Directly use Java’s built-in `indexOf` method, which searches for the first occurrence 
//           of the substring (needle) in the main string (haystack). If not found, it returns -1.
// Time Complexity: O((n - m + 1) * m) in the worst case, where n = haystack length and m = needle length. 
//                  However, Java’s implementation is optimized and may perform better.
// Space Complexity: O(1), as no extra space is used apart from variables.

class Solution
{
    public int strStr(String haystack, String needle) 
    {
        return haystack.indexOf(needle);
    }
}
