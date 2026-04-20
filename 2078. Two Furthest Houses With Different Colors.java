// Problem: 2078. Two Furthest Houses With Different Colors
// Link: https://leetcode.com/problems/two-furthest-houses-with-different-colors/
//
// Approach:
// - The maximum distance must involve one of the endpoints.
// - Check distance from first house (index 0):
//     • Find farthest index i where colors[i] != colors[0].
// - Check distance from last house (index n-1):
//     • Find farthest index i where colors[i] != colors[n-1].
// - Take maximum of both distances.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int maxDistance(int[] colors) 
    {
        int n = colors.length;
        int max = 0;
        for(int i=0;i<n;i++)
        {
            if(colors[0] != colors[i])
            max = Math.max(max,i);
        }

        for(int i=n-1;i>=0;i--)
        {
            if(colors[n-1] != colors[i])
            max = Math.max(max,n-1-i);
        }
        return max;
    }
}
