// Problem: 557. Reverse Words in a String III
// Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
//
// Approach:
// - Split the string into individual words using spaces.
// - Reverse each word independently using a StringBuilder.
// - Append the reversed words to the result, separated by spaces.
// - Remove the trailing space and return the final string.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public String reverseWords(String s) 
    {
        StringBuilder res = new StringBuilder();

        for(String word : s.split(" "))
        {
            res.append(new StringBuilder(word).reverse()).append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
