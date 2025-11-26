// Problem: 55. Jump Game
// Link: https://leetcode.com/problems/jump-game/
// Approach: Greedy. Track the farthest reachable index (`max`). 
//           If at any index i, i > max, then we cannot reach i → return false.
//           Otherwise, update max = max(max, i + nums[i]).
//           If max ever reaches or exceeds the last index, return true.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i > max) return false;
            max = Math.max(max,i+nums[i]);
            if(max >= nums.length-1) return true;
        }
        return true;
    }
}
