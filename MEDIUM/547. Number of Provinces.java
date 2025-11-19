// Problem: 547. Number of Provinces
// Link: https://leetcode.com/problems/number-of-provinces/
// Approach: Use DFS to traverse the adjacency matrix. Each unvisited node starts a new province.
// Mark all nodes reachable from it as visited. The number of DFS calls initiated equals
// the number of provinces.
// Time Complexity: O(n^2) – adjacency matrix traversal
// Space Complexity: O(n) – visited array + recursion stack

class Solution 
{
    boolean visited[];
    public int findCircleNum(int[][] isConnected) 
    {
        visited = new boolean[isConnected.length];
        int provinces = 0;
        for(int i=0;i<isConnected.length;i++)
        {
            if(!visited[i]) 
            {
                provinces++;
                dfs(isConnected,i);
            }
        }
        return provinces;
    }
    public void dfs(int[][] isConnected,int i)
    {
        visited[i] = true;
        for(int j=0;j<isConnected.length;j++)
        {
            if(isConnected[i][j] == 1 && !visited[j])
                dfs(isConnected,j);
        }
    }
}
