// Problem: 1598. Crawler Log Folder
// Link: https://leetcode.com/problems/crawler-log-folder/
//
// Approach:
// - Maintain a counter representing current folder depth.
// - Traverse logs:
//     • "../" → move up → decrement depth if > 0
//     • "./"  → stay → do nothing
//     • "x/"  → move into folder → increment depth
// - Return final depth.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int minOperations(String[] logs) 
    {
        int op = 0;
        for(String s : logs)
        {
            if(s.equals("../"))
            {
                if(op > 0) op--;
            }
            else if(s.equals("./")) continue;
            else op++;
        }
        return op;
    }
}
