// Problem: 118. Pascal's Triangle
// Link: https://leetcode.com/problems/pascals-triangle/
//
// Approach:
// - Create a list to store all rows of Pascal’s Triangle.
// - For each row i from 0 to numRows-1:
//     • Create a new row list.
//     • For each column j from 0 to i:
//         - If j == 0 or j == i → add 1.
//         - Otherwise → value = previousRow[j] + previousRow[j-1].
//     • Add the row to the result list.
// - Return the Pascal triangle.
//
// Time Complexity: O(n²)
//     - Total elements generated = n(n+1)/2
// Space Complexity: O(n²)
//     - Storing all rows.

class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> pascal = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i) row.add(1);
                else
                {
                    List<Integer> prevRow = pascal.get(i-1);
                    row.add(prevRow.get(j) + prevRow.get(j-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
