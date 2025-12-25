// Problem: 3075. Maximize Happiness of Selected Children
// Link: https://leetcode.com/problems/maximize-happiness-of-selected-children/
// Approach:
//   Sort the happiness array in ascending order.
//   Select the top k elements starting from the largest values.
//   Each time a child is selected, their effective happiness decreases by the number
//   of children already selected (modeled using a decreasing counter).
//   Add only positive contributions to the result.
// Time Complexity: O(n log n)
// Space Complexity: O(1) ignoring sorting overhead

class Solution 
{
    public long maximumHappinessSum(int[] happiness, int k) 
    {
        int n = happiness.length;

        int count = 0;
        long res = 0;

        Arrays.sort(happiness);

        for(int i=n-1;i>=n-k;i--)
        {
            if(happiness[i] + count > 0)
                res +=(long) happiness[i] + count;
            count--;
        }
        return res;
    }
}
