// Problem: 1002. Find Common Characters
// Link: https://leetcode.com/problems/find-common-characters/
//
// Approach:
// - Initialize a frequency array using the characters of the first word.
// - For every remaining word:
//     • Count the frequency of its characters.
//     • Update the global frequency array by taking the minimum frequency
//       for each character.
// - After processing all words, the frequency array contains the count of
//   characters common to every word.
// - Add each character to the result list according to its final frequency.
//
// Time Complexity: O(n × m)
//     - n = number of words, m = average length of a word
// Space Complexity: O(1)

class Solution 
{
    public List<String> commonChars(String[] words) 
    {
        List<String> res = new ArrayList<>();

        int[] freq = new int[26];

        for(char c:words[0].toCharArray()) freq[c-'a']++;

        for(int i=1;i<words.length;i++)
        {
            int[] temp = new int[26];
            for(char c:words[i].toCharArray())
            {
                temp[c-'a']++;
            }

            for(int j=0;j<26;j++)
            {
                freq[j] = Math.min(freq[j],temp[j]);
            }
        }

        for(int i=0;i<26;i++)
        {
            while(freq[i]-- > 0)
            {
                res.add(String.valueOf((char)(i+'a')));
            }
        }
        return res;
    }
}
