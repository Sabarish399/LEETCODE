// Problem: 3074. Apple Redistribution into Boxes
// Link: https://leetcode.com/problems/apple-redistribution-into-boxes/
// Approach:
//   First, compute the total number of apples.
//   Sort the box capacities in ascending order.
//   Starting from the largest capacity, keep placing apples into boxes
//   until all apples are distributed.
//   Count how many boxes are used.
// Time Complexity: O(n log n)
// Space Complexity: O(1) ignoring sorting overhead

class Solution 
{
    public int minimumBoxes(int[] apple, int[] capacity) 
    {
        int total = 0,count = 0;

        for(int i:apple) total += i;

        Arrays.sort(capacity);

        int j = capacity.length-1;

        while(total > 0 && j>=0)
        {
            total -= capacity[j];
            j--;
            count++;
        }
        return count;
    }
}
