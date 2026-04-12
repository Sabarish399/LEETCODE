// Problem: 1011. Capacity To Ship Packages Within D Days
// Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
//
// Approach (Binary Search on Answer + Greedy Check):
// - The answer (capacity) lies between:
//     • minCap = max(weights)  → must at least carry the heaviest package
//     • maxCap = sum(weights) → ship all in one day
// - Binary search this range.
// - For a candidate capacity `mid`:
//     • Simulate shipping:
//         - Accumulate weights until exceeding `mid`, then increment day count.
//     • If required days > given days → capacity too small → increase left.
//     • Else → capacity is sufficient → try smaller → move right.
// - Return the minimum feasible capacity.
//
// Time Complexity: O(n log S)
//     - n = number of packages
//     - S = sum of weights (search space)
// Space Complexity: O(1)

class Solution 
{
    public int shipWithinDays(int[] weights, int days) 
    {
        int minCap = 0;
        int maxCap = 0;

        for(int i:weights) 
        {
            minCap = Math.max(minCap,i);
            maxCap += i;
        }

        int left = minCap;
        int right = maxCap;

        while(left < right)
        {
            int mid = left + (right-left)/2;
            int weight = 0;
            int minDays = 1;

            for(int i:weights)
            {
                if(weight + i > mid)
                {
                    weight = 0;
                    minDays++;
                }
                weight += i;
            }
            if(minDays > days) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
