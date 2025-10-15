// Problem: 1732. Find the Highest Altitude
// Link: https://leetcode.com/problems/find-the-highest-altitude/
// Approach: Initialize current altitude as 0 and iterate through the `gain` array. 
//           Continuously add each gain value to `currentAltitude` and track the 
//           maximum altitude reached using `Math.max()`.
//           Since the biker starts from 0, we compare after each step.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int n = gain.length;
        int currAltitude = 0 , maxAltitude = 0;

        for(int i : gain)
        {
            currAltitude += i;
            maxAltitude = Math.max(maxAltitude,currAltitude);
        }
        return maxAltitude;        
    }
}
