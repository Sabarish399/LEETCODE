// Problem: 554. Brick Wall
// Link: https://leetcode.com/problems/brick-wall/
//
// Approach:
// - Traverse each row and compute the prefix sum of brick widths, excluding
//   the last brick to avoid counting the wall's right edge.
// - Use a HashMap to count how many rows have a brick edge at each prefix sum.
// - Track the maximum number of aligned brick edges across all rows.
// - The minimum number of bricks crossed is the total number of rows minus
//   the maximum aligned edges.
//
// Time Complexity: O(n × m)
//     - n = number of rows, m = average number of bricks per row
// Space Complexity: O(n × m)

class Solution 
{
    public int leastBricks(List<List<Integer>> wall) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);

        int max = 0;
        for(List<Integer> rows : wall)
        {
            int width = 0;
            for(int i=0;i<rows.size()-1;i++)
            {
                width += rows.get(i);
                int val = map.getOrDefault(width,0)+1;
                map.put(width, val);

                max = Math.max(max,val);
            }
        }

        return wall.size()-max;
    }
}
