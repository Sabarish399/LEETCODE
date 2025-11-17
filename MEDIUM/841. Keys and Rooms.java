// Problem: 841. Keys and Rooms
// Link: https://leetcode.com/problems/keys-and-rooms/
// Approach: Depth-First Search. Start from room 0, mark it visited, and recursively
// visit all rooms for which you obtain keys. After DFS completes, verify that
// every room has been visited.
// Time Complexity: O(rooms + keys)
// Space Complexity: O(n) – visited array + recursion stack

class Solution 
{
    boolean visited[];
    public boolean canVisitAllRooms(List<List<Integer>> rooms) 
    {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms,0);
        for(boolean b:visited) if(!b) return false;
        return true;
    }
    public void dfs(List<List<Integer>> rooms,int idx)
    {
        for(int i:rooms.get(idx))
        {
            if(!visited[i]) 
            {   
                visited[i] = true;
                dfs(rooms,i);
            }
        }
    }
}
