// Problem: 1207. Unique Number of Occurrences
// Link: https://leetcode.com/problems/unique-number-of-occurrences/
// Approach: Use a HashMap to store the frequency of each element in the array.  
//           Then, convert the frequency values into a HashSet.  
//           If the size of the map and set are equal, all occurrences are unique.  
//           Otherwise, at least two numbers share the same occurrence count.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
        
        return map.size() == new HashSet<>(map.values()).size();
    }
}
