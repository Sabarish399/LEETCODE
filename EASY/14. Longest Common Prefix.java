// Problem: 14. Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/
// Approach:
//   Use the first string as the initial prefix.
//   For each subsequent string, repeatedly shorten the prefix until
//   it becomes a valid prefix (indexOf(prefix) == 0).
//   If the prefix becomes empty, return an empty string.
// Time Complexity: O(n * m) where n is number of strings and m is prefix length
// Space Complexity: O(1)

class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length == 0 || strs ==null) 
            return "";

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix) !=0)
                prefix = prefix.substring(0,prefix.length()-1);
            if(prefix.length() == 0) 
                return "";
        }
        return prefix;
    }
}  
