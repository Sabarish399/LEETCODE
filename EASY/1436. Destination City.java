// Problem: 1436. Destination City
// Link: https://leetcode.com/problems/destination-city/
//
// Approach:
// - Store all source cities in a HashSet.
// - Traverse paths again:
//     • If a destination city is not present in the source-city set,
//       it must be the final destination.
// - Return that city.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public String destCity(List<List<String>> paths) 
    {
        Set<String> city1 = new HashSet<>();
        
        for(List<String> path : paths)
            city1.add(path.get(0));

        for(List<String> path : paths)
        {
            if(!city1.contains(path.get(1)))
                 return path.get(1);
        }
        return " ";
    }
}
