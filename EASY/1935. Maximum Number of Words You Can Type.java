// Problem: 1935. Maximum Number of Words You Can Type
// Link: https://leetcode.com/problems/maximum-number-of-words-you-can-type/
// Approach: Split the text into words, check each word against every broken letter.
//           If a broken letter is found in a word, skip it by reducing the count.
// Time Complexity: O(n * m)   // n = number of words, m = number of broken letters
// Space Complexity: O(1)

class Solution 
{
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        String splittedText[] = text.split(" ");
        int noOfWords = splittedText.length;
      
        for(String word : splittedText)
        {
            for(char c : brokenLetters.toCharArray())
            {
                if(word.contains(String.valueOf(c)))
                {
                    noOfWords--;
                    break;
                }
            }
        }
        return noOfWords;
    }
}
