// Problem: 2418. Sort the People
// Link: https://leetcode.com/problems/sort-the-people/
//
// Approach:
// - Store each person's height and name in a TreeMap with heights as keys.
// - Use a reverse-order TreeMap so entries are automatically sorted in
//   descending order of height.
// - Traverse the map and overwrite the names array with names in sorted order.
// - Return the modified names array.
//
// Time Complexity: O(n log n)
// Space Complexity: O(n)

class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        Map<Integer,String> people = new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<names.length;i++)
        {
            people.put(heights[i],names[i]);
        }

        int i=0;
        for(Map.Entry<Integer,String> entry : people.entrySet())
        {
            names[i++] = entry.getValue();
        }
        return names;
    }
}
