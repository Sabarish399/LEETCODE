// Problem: 657. Robot Return to Origin
// Link: https://leetcode.com/problems/robot-return-to-origin/
//
// Approach:
// - Track robot position using coordinates (x, y).
// - Traverse the moves string:
//     • 'U' → y++
//     • 'D' → y--
//     • 'R' → x++
//     • 'L' → x--
// - At the end, if (x == 0 && y == 0), robot returned to origin.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        int x = 0;
        int y = 0;

        for(char c:moves.toCharArray())
        {
            if(c=='U') y++;
            else if(c=='D') y--;
            else if(c=='R') x++;
            else if(c=='L') x--;
        }
        return x == 0 && y == 0;
    }
}
