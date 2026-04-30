// Problem: 290. Word Pattern
// Link: https://leetcode.com/problems/word-pattern/
//
// Approach (Bidirectional Mapping):
// - Split the string into words.
// - If pattern length != number of words → return false.
// - Use two maps:
//     • char → word
//     • word → char
// - For each position i:
//     • Ensure pattern[i] maps to the same word
//     • Ensure word maps back to the same character
// - If both mappings are consistent → return true.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {   
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++)
        {
            char c = pattern.charAt(i);
            String word = words[i];

            if(map1.containsKey(c))
            {
                if(!map1.get(c).equals(word)) return false;
            }
            else
                map1.put(c, word);

            if(map2.containsKey(word))
            {
                if(map2.get(word) != c) return false;
            }
            else
                map2.put(word, c);
        }
        return true;
    }
}
