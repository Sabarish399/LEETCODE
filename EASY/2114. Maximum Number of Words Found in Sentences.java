// Problem: 2114. Maximum Number of Words Found in Sentences
// Link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
// Approach:
//   For each sentence, split the string by spaces.
//   The number of words equals the number of resulting parts.
//   Track and return the maximum count.
// Time Complexity: O(n * m) where m is the average sentence length
// Space Complexity: O(m) due to split array creation

class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int maxLen = 0;
        for(String s:sentences)
        {
            int currLen = s.split(" ").length;
            if(maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }
}
