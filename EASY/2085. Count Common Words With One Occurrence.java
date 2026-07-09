// Problem: 2085. Count Common Words With One Occurrence
// Link: https://leetcode.com/problems/count-common-words-with-one-occurrence/
//
// Approach:
// - Count the frequency of each word in the first array using a HashMap.
// - Traverse the second array:
//     • If a word appears exactly once in the first array, decrement its count.
//     • Ignore words that are absent or appear multiple times in the first array.
// - Count the words whose final frequency becomes 0, indicating they appeared
//   exactly once in both arrays.
// - Return the total count.
//
// Time Complexity: O(n + m)
//     - n = words1.length, m = words2.length
// Space Complexity: O(n)

class Solution 
{
    public int countWords(String[] words1, String[] words2) 
    {
        Map<String,Integer> words = new HashMap<>();

        for(String s : words1)
        {
            words.put(s,words.getOrDefault(s,0)+1);
        }

        for(String s : words2)
        {
            if(words.containsKey(s) && words.get(s) <= 1)
                words.put(s,words.get(s) - 1);
        }

        int count = 0;
        for(int i : words.values())
        {
            if(i == 0) count++;
        }

        return count;
    }
}
