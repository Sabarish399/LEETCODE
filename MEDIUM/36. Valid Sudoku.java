// Problem: 36. Valid Sudoku
// Link: https://leetcode.com/problems/valid-sudoku/
// Approach:
//   Use three boolean matrices to track digits seen in each row, column, and 3×3 box.
//   For every non-empty cell:
//     - Convert the digit to an index (0–8).
//     - Compute the box index using (row / 3) * 3 + (col / 3).
//     - If the digit already exists in the corresponding row, column, or box, the board is invalid.
//     - Otherwise, mark the digit as seen.
// Time Complexity: O(1) — fixed 9×9 board
// Space Complexity: O(1) — constant-sized tracking arrays

class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.')
                {
                    int num = board[i][j] - '1';
                    int box = (i/3) *3+ (j/3);

                    if(rows[i][num] || cols[j][num] || boxes[box][num]) return false;

                    rows[i][num] = cols [j][num] = boxes[box][num] = true;
                }
            }
        }
        return true;
    }
}
