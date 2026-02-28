// Problem: 1812. Determine Color of a Chessboard Square
// Link: https://leetcode.com/problems/determine-color-of-a-chessboard-square/
//
// Approach:
// - Each square color depends on parity of (column + row).
// - Convert column character to number:
//     • coordinate.charAt(0) - 'a'
// - Convert row character to number:
//     • coordinate.charAt(1) - '0'
// - If (column + row) is even → same color.
// - If odd → different color.
// - Compare parity of both coordinates.
//
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) 
    {
        int c1 = coordinate1.charAt(0) - 'a' + coordinate1.charAt(1) - '0';
        int c2 = coordinate2.charAt(0) - 'a' + coordinate2.charAt(1) - '0';

        return c1 % 2 == c2 % 2;
    }
}
