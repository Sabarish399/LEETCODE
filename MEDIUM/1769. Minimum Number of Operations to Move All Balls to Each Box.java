// Problem: 1769. Minimum Number of Operations to Move All Balls to Each Box
// Link: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
//
// Approach:
// - Perform two passes over the boxes.
// - In the left-to-right pass, maintain the number of balls seen so far and
//   the total moves required to bring them to the current box.
// - In the right-to-left pass, repeat the process for balls on the right.
// - Add the contributions from both passes to obtain the minimum operations
//   required for each box.
// - Return the resulting array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
//     - Excluding the output array

class Solution 
{
    public int[] minOperations(String boxes) 
    {
        int[] res = new int[boxes.length()];
        int balls = 0, moves = 0;

        for(int i=0;i<boxes.length();i++)
        {
            res[i] += balls+moves;
            moves += balls;
            balls += boxes.charAt(i) - '0';
        }

        moves = balls = 0;

        for(int i=boxes.length()-1;i>=0;i--)
        {
            res[i] += balls + moves;
            moves += balls;
            balls += boxes.charAt(i) - '0';
        }

        return res;
    }
}
