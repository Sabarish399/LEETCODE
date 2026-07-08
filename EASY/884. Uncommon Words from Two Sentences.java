// Problem: 884. Uncommon Words from Two Sentences
// Link: https://leetcode.com/problems/uncommon-words-from-two-sentences/
//
// Approach:
// - Split both sentences into individual words.
// - Count the frequency of every word using a HashMap.
// - Traverse the map and collect words whose frequency is exactly 1.
// - Convert the collected words into a String array and return it.
//
// Time Complexity: O(n + m)
//     - n = number of words in s1, m = number of words in s2
// Space Complexity: O(n + m)

class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        Map<String,Integer> words = new HashMap<>();

        for(String s : s1.split(" "))
        {
            words.put(s,words.getOrDefault(s,0)+1);
        }
        
        for(String s : s2.split(" "))
        {
            words.put(s,words.getOrDefault(s,0)+1);
        }

        ArrayList<String> res = new ArrayList<>();

        for(String s : words.keySet())
        {
            if(words.get(s) == 1) res.add(s);
        }

        return res.toArray(new String[0]);
    }
}
