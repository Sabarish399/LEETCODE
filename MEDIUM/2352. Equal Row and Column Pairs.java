// Problem: 2352. Equal Row and Column Pairs
// Link: https://leetcode.com/problems/equal-row-and-column-pairs/
// Approach: 
// 1. Store each row of the grid as a string in a HashMap with its frequency.
// 2. For each column, form a string representation and check if it exists in the map.
// 3. Add the count from the map to the total count for matching row-column pairs.
// Time Complexity: O(n²) — each row and column is traversed fully.
// Space Complexity: O(n²) — storage for row strings in the map.

class Solution 
{
    public int equalPairs(int[][] grid) 
    {

        Map<String,Integer> map = new HashMap<>();
        int count = 0,n=grid.length;

        for(int i[] : grid)
        {
            String s = Arrays.toString(i);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(int i=0;i<n;i++)
        {
            int[] arr = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j] = grid[j][i];
            }
            String s = Arrays.toString(arr);
            count += map.getOrDefault(s,0);
        }
        return count;
    }
}
