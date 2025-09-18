// Problem: 49. Group Anagrams
// Link: https://leetcode.com/problems/group-anagrams/
// Approach: Sort each string to generate a key. Store strings with the same sorted key in a HashMap. 
//           Finally, return the grouped values as a list.
// Time Complexity: O(n * k log k), where n is the number of strings and k is the maximum string length (for sorting).
// Space Complexity: O(n * k), for storing grouped anagrams in the map."

class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            map.computeIfAbsent(k,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
