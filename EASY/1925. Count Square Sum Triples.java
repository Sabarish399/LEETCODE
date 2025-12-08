// Problem: 1925. Count Square Sum Triples
// Link: https://leetcode.com/problems/count-square-sum-triples/
// Approach:
//   Iterate over i < j ≤ n. For each pair, compute i² + j²,
//   and check if it forms a perfect square c² with c ≤ n.
//   Each valid (i, j, c) generates two ordered triples: (i, j, c) and (j, i, c),
//   so increment by 2.
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution 
{
    public int countTriples(int n) 
    {
        int count=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int sumOfSquares = i*i+j*j;
                int c = (int) Math.sqrt(sumOfSquares);

                if(c*c == sumOfSquares && c<=n)
                    count+=2;
            }
        }
        return count;
    }
}
