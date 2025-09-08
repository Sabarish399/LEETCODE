// Problem: 485. Max Consecutive Ones
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Approach: Traverse the array while keeping a counter for consecutive 1s. Reset counter on 0 and track the maximum count.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
    
      int count = 0,maxCount = 0;    
      for(int i:nums)
      {
        if(i==1)
        {
            count++;
            maxCount = Math.max(count,maxCount);
        }
        else
            count=0;
      }
        return maxCount;
    }
}
