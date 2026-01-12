// Problem: 1266. Minimum Time Visiting All Points
// Link: https://leetcode.com/problems/minimum-time-visiting-all-points/
// Approach:
//   To move from one point to another, the minimum time required is the maximum of
//   the absolute differences in x and y coordinates.
//   This is because diagonal movement allows reducing both x and y simultaneously.
//   Sum this value for every consecutive pair of points.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int minTimeToVisitAllPoints(int[][] points) 
    {
        int time = 0;
        for(int i=1;i<points.length;i++)
        {
            time += Math.max(
                            Math.abs(points[i][0] -points[i-1][0]),
                            Math.abs(points[i][1] - points[i-1][1])
                            );
        }
        return time;
    }
}
