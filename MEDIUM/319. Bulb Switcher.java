// Problem: 319. Bulb Switcher
// Link: https://leetcode.com/problems/bulb-switcher/
// Approach:
//   A bulb ends up ON only if it is toggled an odd number of times.
//   Only perfect squares have an odd number of divisors.
//   Therefore, count how many perfect squares are ≤ n.
// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)

class Solution 
{
    public int bulbSwitch(int n) 
    {
        int count=0;

        for(int i=1;i*i<=n;i++)
            count++;
        return count;
    }
}
