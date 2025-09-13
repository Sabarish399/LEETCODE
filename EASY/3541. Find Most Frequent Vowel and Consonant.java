// Problem: 3541. Find Most Frequent Vowel and Consonant
// Link: https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/
// Approach: Use a HashMap to count frequencies of characters. 
//           Track the highest frequency vowel and consonant separately,
//           then return their sum.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxFreqSum(String s) 
    {
        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxVowel=0,maxCons=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            char c = entry.getKey();
            int freq = entry.getValue();

            if("aeiou".indexOf(c) != -1)
                maxVowel = Math.max(maxVowel,freq);
            else
                maxCons = Math.max(maxCons,freq);
        }
        return maxVowel+maxCons;
    }
}
