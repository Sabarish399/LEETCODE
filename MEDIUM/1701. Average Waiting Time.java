// Problem: 1701. Average Waiting Time
// Link: https://leetcode.com/problems/average-waiting-time/
//
// Approach:
// - Maintain the current time when the chef finishes the previous order.
// - For each customer:
//     • If the chef is idle, move the current time to the customer's arrival time.
//     • Add the preparation time to get the customer's finish time.
//     • The customer's waiting time is finish time minus arrival time.
// - Accumulate the waiting times of all customers.
// - Return the average waiting time.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public double averageWaitingTime(int[][] customers) 
    {
        long runTime = 0;
        long waitTime = 0;

        for(int[] cus : customers)
        {
            int arrTime = cus[0];
            int prepTime = cus[1];

            if(arrTime > runTime)
            {
                runTime = arrTime;
            }
            runTime += prepTime;

            waitTime += runTime - arrTime;
        }

        return waitTime / (double) customers.length;
    }
}
