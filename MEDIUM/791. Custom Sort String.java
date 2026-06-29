// Problem: 791. Custom Sort String
// Link: https://leetcode.com/problems/custom-sort-string/
//
// Approach:
// - Count the frequency of each character in the string s.
// - Traverse the order string and append each character according to its
//   frequency in s.
// - After processing all characters in order, append the remaining
//   characters that were not present in order.
// - Return the constructed string following the custom order.
//
// Time Complexity: O(n + m)
//     - n = s.length(), m = order.length()
// Space Complexity: O(1)

class Solution 
{
    public String customSortString(String order, String s) 
    {
        int[] freq = new int[26];

        for(char c : s.toCharArray())
            freq[c-'a']++;

        StringBuilder res = new StringBuilder();

        for(char c : order.toCharArray())
        {
            while(freq[c-'a']-- > 0)
                res.append(c);
        }

        for(int i=0;i<26;i++)
        {
            while(freq[i]-- > 0)
                res.append((char) (i+'a'));
        }

        return res.toString();
    }
}
