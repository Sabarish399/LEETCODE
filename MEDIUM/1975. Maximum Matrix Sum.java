// Problem: 1975. Maximum Matrix Sum
// Link: https://leetcode.com/problems/maximum-matrix-sum/
// Approach:
//   Flip signs to maximize the total sum.
//   Traverse the matrix and:
//     - Count how many negative numbers exist.
//     - Add absolute values to the total sum.
//     - Track the minimum absolute value.
//   If the count of negative numbers is even, all values can be made positive.
//   If odd, one value must remain negative — subtract twice the smallest absolute value.
// Time Complexity: O(m * n)
// Space Complexity: O(1)

class Solution 
{
    public long maxMatrixSum(int[][] matrix) 
    {
        long sum = 0;
        int neg = 0;
        int min = Integer.MAX_VALUE;

        for(int[] row:matrix)
        {
            for(int i:row)
            {
                if(i < 0)
                {
                    neg++;
                    i = -i;
                }

                sum += i;
                min = Math.min(i,min);
            }
        }
        return neg%2==0 ? sum : sum - 2*min;
    }
}
