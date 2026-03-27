// Problem: 119. Pascal's Triangle II
// Link: https://leetcode.com/problems/pascals-triangle-ii/
//
// Approach:
// - Start with the first row: [1].
// - Iteratively build each row up to rowIndex:
//     • Create a new row starting with 1.
//     • For each middle element:
//         - row[j] = prevRow[j-1] + prevRow[j].
//     • End the row with 1.
// - Update reference to the new row each iteration.
// - Return the final row.
//
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution 
{
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> pascal = new ArrayList<>();
        pascal.add(1);

        for(int i=0;i<rowIndex;i++)
        {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j=1;j<=i;j++)
                row.add(pascal.get(j-1)+pascal.get(j));

            row.add(1);
            pascal = row;
        }
        return pascal;
    }
}
