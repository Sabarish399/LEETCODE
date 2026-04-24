// Problem: 2833. Furthest Point From Origin
// Link: https://leetcode.com/problems/furthest-point-from-origin/
//
// Approach:
// - Count:
//     • L → moves left
//     • R → moves right
//     • _ → flexible moves
// - Net displacement without '_' = |L - R|
// - To maximize distance, assign all '_' in the same direction
//   as the dominant side → increases distance.
// - Final answer = |L - R| + count('_')
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int furthestDistanceFromOrigin(String moves) 
    {
        int l = 0, r = 0, u = 0;
        for(char c:moves.toCharArray())
        {
            if(c == 'L') l++;
            else if(c == 'R') r++;
            else u++;
        }
        return Math.abs(l-r)+u;
    }
}
