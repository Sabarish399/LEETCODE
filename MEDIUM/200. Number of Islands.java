// Problem: 200. Number of Islands
// Link: https://leetcode.com/problems/number-of-islands/
//
// Approach:
// - Traverse every cell in the grid.
// - Whenever an unvisited land cell ('1') is found, increment the island count.
// - Perform DFS to visit all connected land cells in four directions.
// - Mark visited cells as '0' to avoid revisiting them.
// - The total number of DFS calls started from land cells gives the number of islands.
//
// Time Complexity: O(m × n)
// Space Complexity: O(m × n) 

class Solution 
{
    final int[][] diff = { {-1,0}, {0,-1}, {1,0}, {0,1} };

    public int numIslands(char[][] grid) 
    {
        int row = grid.length, col = grid[0].length;

        int islands = 0;

        for(int r=0;r<row;r++)
        {
            for(int c=0;c<col;c++)
            {
                if(grid[r][c] == '1')
                {
                    islands++;
                    dfs(grid, row, col, r, c);
                }
            }
        }
            return islands;
    }

    void dfs(char[][] grid, int row, int col, int r, int c)
    {
        grid[r][c] = '0';

        for(int i=0;i<4;i++)
        {
            int adjRow = r+diff[i][0];
            int adjCol = c+diff[i][1];

            if(adjRow >= 0 && adjCol >=0 && adjRow < row && adjCol < col && grid[adjRow][adjCol]=='1')
                dfs(grid, row, col, adjRow, adjCol);
        }
    }

}
