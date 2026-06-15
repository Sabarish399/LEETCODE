// Problem: 1496. Path Crossing
// Link: https://leetcode.com/problems/path-crossing/
//
// Approach:
// - Start from the origin (0,0) and store it in a HashSet.
// - Traverse the path and update the current coordinates based on the direction.
// - Represent each visited coordinate as a string "x,y".
// - If the current coordinate has already been visited, the path crosses itself.
// - Otherwise, add the coordinate to the set and continue.
// - If the traversal completes without revisiting a coordinate, return false.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public boolean isPathCrossing(String path) 
    {
        Set<String> set = new HashSet<>();
        int x=0,y=0;

        set.add("0,0");
        for(char c : path.toCharArray())
        {
            if(c=='N') x++;
            else if(c=='S') x--;
            else if(c=='W') y--;
            else y++;

            String points = x+","+y;
            if(set.contains(points)) return true;
            set.add(points);
        }
        return false;
    }
}
