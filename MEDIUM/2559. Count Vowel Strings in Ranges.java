// Problem: 2559. Count Vowel Strings in Ranges
// Link: https://leetcode.com/problems/count-vowel-strings-in-ranges/
//
// Approach:
// - Build a prefix sum array where prefixSum[i] stores the number of words
//   starting and ending with a vowel among the first i words.
// - For each word, check whether its first and last characters are vowels
//   and update the prefix sum accordingly.
// - For every query [l, r], compute the answer as
//   prefixSum[r + 1] - prefixSum[l].
// - Return the result for all queries.
//
// Time Complexity: O(n + q)
//     - n = number of words, q = number of queries
// Space Complexity: O(n)

class Solution 
{
    public int[] vowelStrings(String[] words, int[][] queries) 
    {
        String vowels = "aeiou";
        int[] prefixSum = new int[words.length+1];

        for(int i=1;i<prefixSum.length;i++)
        {
            prefixSum[i] = prefixSum[i-1];

            String word = words[i-1];
            if( 
                vowels.indexOf(word.charAt(0)) != -1 && 
                vowels.indexOf(word.charAt(word.length()-1)) != -1 
              )
                prefixSum[i]++;
        }

        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];

            res[i] = prefixSum[r+1]-prefixSum[l];
        }
        return res;
    }
}
