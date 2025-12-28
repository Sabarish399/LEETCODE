// Problem: 1351. Count Negative Numbers in a Sorted Matrix
// Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
// Approach:
//   Each row is sorted in non-increasing order.
//   Scan each row from left to right. When the first negative number is found at index j,
//   all elements to the right of j are also negative.
//   Add (rowLength - j) to the count and move to the next row.
// Time Complexity: O(m * n) in the worst case
// Space Complexity: O(1)

class Solution 
{
    public int countNegatives(int[][] grid) 
    {
        int count = 0;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]<0) 
                {
                    count += grid[i].length-j;
                    break;
                }
            }
        }
        return count;
    }
}
