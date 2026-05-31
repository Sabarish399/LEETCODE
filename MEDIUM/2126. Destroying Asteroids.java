// Problem: 2126. Destroying Asteroids
// Link: https://leetcode.com/problems/destroying-asteroids/
//
// Approach (Greedy + Sorting):
// - Sort asteroids in ascending order.
// - Maintain current mass.
// - Process asteroids from smallest to largest:
//     • If current mass < asteroid size → cannot destroy → return false.
//     • Otherwise destroy it and add its mass to current mass.
// - If all asteroids are destroyed → return true.
//
// Time Complexity: O(n log n)
//     - Sorting dominates.
// Space Complexity: O(1)
//     - Ignoring sorting space

class Solution 
{
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
        Arrays.sort(asteroids);

        long sum = mass;
        for(int num:asteroids)
        {
            if(sum < num) return false;

            sum += num;
        }
        return true;
    }
}
