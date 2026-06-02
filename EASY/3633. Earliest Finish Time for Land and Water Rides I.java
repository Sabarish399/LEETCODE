// Problem: 3633. Earliest Finish Time for Land and Water Rides I
// Link: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/
//
// Approach:
// - Compute the earliest possible finish time of any land ride.
// - Compute the earliest possible finish time of any water ride.
// - Then try both orders:
//     • land first, then water
//     • water first, then land
// - For a fixed second ride, the best first ride is the one with the smallest finish time,
//   because max(firstFinish, startTime) is monotonic in firstFinish.
// - Return the minimum finish time over both orders.
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Solution 
{
    public int earliestFinishTime(int[] lS, int[] lD, int[] wS, int[] wD) 
    {
        int minL = Integer.MAX_VALUE;
        int minW = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;

        for(int i=0;i<lS.length;i++)
            minL = Math.min(minL,lS[i] + lD[i]);

        for(int i=0;i<wS.length;i++)
        {
            minW = Math.min(minW,wS[i]+wD[i]);

            res = Math.min(res,Math.max(minL,wS[i]) + wD[i]);
        }

        for(int i=0;i<lS.length;i++)
            res = Math.min(res,Math.max(minW,lS[i]) + lD[i]);

        return res;
    }
}
