// Problem: 1037. Valid Boomerang
// Link: https://leetcode.com/problems/valid-boomerang/
//
// Approach (Slope / Cross Product):
// - Three points form a boomerang if they are NOT collinear.
// - Instead of computing slopes (risk of division by zero), use cross product:
//     • (y2 - y1) * (x3 - x1) != (y3 - y1) * (x2 - x1)
// - If this condition holds → points are not in a straight line → valid boomerang.
//
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public boolean isBoomerang(int[][] points) 
    {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        return (y2-y1) * (x3 - x2) != (y3 - y2) * (x2 - x1);
    }
}
