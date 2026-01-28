// Problem: 821. Shortest Distance to a Character
// Link: https://leetcode.com/problems/shortest-distance-to-a-character/
// Approach:
//   Use a two-pass strategy.
//   First pass (left to right):
//     - Track the most recent position of character c.
//     - Compute distance from current index to the last seen c on the left.
//   Second pass (right to left):
//     - Track the most recent position of c on the right.
//     - Update each position with the minimum of current distance and right-side distance.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int[] shortestToChar(String s, char c) 
    {
        int[] ans = new int[s.length()];
        int pos = -s.length();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c) pos = i;
            ans[i] = i - pos;
        }
        pos = 2*s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == c) pos = i;
            ans[i] = Math.min(ans[i],pos-i);
        }
        return ans;
    }
}
