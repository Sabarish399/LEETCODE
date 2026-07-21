// Problem: 1930. Unique Length-3 Palindromic Subsequences
// Link: https://leetcode.com/problems/unique-length-3-palindromic-subsequences/
//
// Approach:
// - Record the first and last occurrence of every character in the string.
// - For each character, consider it as the first and last character of a
//   length-3 palindrome.
// - Traverse the substring between its first and last occurrences.
// - Use a boolean array to track distinct middle characters.
// - Each unique middle character forms a unique palindromic subsequence;
//   accumulate the count and return the result.
//
// Time Complexity: O(26 × n)
// Space Complexity: O(1)

class Solution 
{
    public int countPalindromicSubsequence(String s) 
    {
        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first,-1);
        Arrays.fill(last,-1);

        for(int i=0;i<s.length();i++)
        {
            int idx = s.charAt(i)-'a';
            if(first[idx] == -1) first[idx] = i;
            last[idx] = i;
        }

        int res=0;
        for(int i=0;i<26;i++)
        {
            if(first[i] == -1 && first[i] == last[i]) continue;

            boolean[] seen = new boolean[26];
            for(int j=first[i]+1;j<last[i];j++)
            {
                int mid = s.charAt(j)-'a';
                if(!seen[mid])
                {
                    seen[mid] = true;
                    res++;
                }
            }
        }
        return res;
    }
}
