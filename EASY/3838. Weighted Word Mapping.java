// Problem: 3838. Weighted Word Mapping
// Link: https://leetcode.com/problems/weighted-word-mapping/
//
// Approach:
// - Traverse each word in the array.
// - Compute the total weight of the word by summing the weights of its characters.
// - Take the total weight modulo 26.
// - Map the result to a character in reverse alphabetical order
//   (0 -> 'z', 1 -> 'y', ..., 25 -> 'a') using ('z' - sum % 26).
// - Append the mapped character to the answer string and return the final result.
//
// Time Complexity: O(L)
//     - L = total number of characters across all words
// Space Complexity: O(W)
//     - W = number of words (for the output string builder)

class Solution 
{
    public String mapWordWeights(String[] words, int[] weights) 
    {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            int sum = 0;
            for(char c:words[i].toCharArray())
            {
                sum += weights[c-'a'];
            }
            s.append((char)('z'-sum%26));
        }
        return s.toString();
    }
}
