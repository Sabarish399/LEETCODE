// Problem: 1518. Water Bottles
// Link: https://leetcode.com/problems/water-bottles/
// Approach: Start with the given number of full bottles. After drinking, exchange empty bottles 
//           for new full ones as long as possible. Keep track of the total number of bottles drunk 
//           by repeatedly converting empty bottles into new ones.
// Time Complexity: O(log n), since each exchange reduces the number of bottles significantly.
// Space Complexity: O(1), using only a few variables.

class Solution 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        if(numBottles < numExchange)
            return numBottles;

        int max = numBottles, emptyBottles = numBottles;

        while(emptyBottles >= numExchange)
        {
            int newBottles = emptyBottles / numExchange;
            int remainder = emptyBottles %  numExchange;
            max += newBottles;
            emptyBottles = newBottles + remainder;
        }
        return max;
    }
}
