// Problem: 812. Largest Triangle Area
// Link: https://leetcode.com/problems/largest-triangle-area/
// Approach: Iterate over all triplets of points. Use the shoelace formula (determinant method) 
//           to calculate the area of the triangle formed by each triplet, and track the maximum.
// Time Complexity: O(n³), where n is the number of points (checking all triplets).
// Space Complexity: O(1), since only a few variables are used.

class Solution 
{
    public double largestTriangleArea(int[][] points) 
    {
        double finalArea = 0;
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                for(int k=j+1;k<points.length;k++)
                {
                    double currArea = 0.5 * Math.abs(points[i][0]*(points[j][1]-points[k][1])+
                                                 points[j][0]*(points[k][1]-points[i][1])+
                                                 points[k][0]*(points[i][1]-points[j][1]));
                    finalArea = Math.max(currArea,finalArea);
                }
            }
        }
        return finalArea;
    }
}
