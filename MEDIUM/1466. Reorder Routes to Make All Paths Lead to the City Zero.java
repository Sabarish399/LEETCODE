// Problem: 1466. Reorder Routes to Make All Paths Lead to the City Zero
// Link: https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
// Approach: Build an undirected representation but encode original direction by sign:
//   - For an original directed edge u -> v, store +v in adjacency list of u and -u in adjacency list of v.
//   - Do a DFS from node 0. For each neighbor `end`, if it hasn't been visited, recurse and
//     add 1 to the answer when the stored value is positive (meaning the original edge was from current -> neighbor
//     and needs to be reversed to point to 0).
// Time Complexity: O(n) — each node and each edge is visited once
// Space Complexity: O(n) — adjacency lists + visited array + recursion stack

class Solution 
{
    public int minReorder(int n, int[][] connections)
    {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());

        for(var c : connections)
        {
            graph.get(c[0]).add(c[1]);
            graph.get(c[1]).add(-c[0]);
        }
        return dfs(graph,new boolean[n],0);
    }
    int dfs(List<List<Integer>> graph,boolean[] visited,int start)
    {
        int change = 0;
        visited[start]=true;
        for(var end:graph.get(start))
        {
            if(!visited[Math.abs(end)])
                change += dfs(graph,visited,Math.abs(end))+(end > 0 ? 1:0);
        }
        return change;
    }
}
