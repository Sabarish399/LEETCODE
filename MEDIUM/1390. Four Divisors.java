// Problem: 1390. Four Divisors
// Link: https://leetcode.com/problems/four-divisors/
// Approach:
//   For each number, iterate up to its square root to find divisors.
//   Count divisors and accumulate their sum.
//   For every divisor i, include both i and num / i (if distinct).
//   If the divisor count exceeds 4, stop early.
//   Add the sum only if the number has exactly 4 divisors.
// Time Complexity: O(n * sqrt(m)) where m is the maximum value in nums
// Space Complexity: O(1)

class Solution 
{
    public int sumFourDivisors(int[] nums) 
    {
        int totalSum = 0;
        
        for(int num:nums)
        {
            int countOfDivisors = 0;
            int sum = 0;

            for(int i=1;i*i<=num;i++)
            {
                if(num%i == 0)
                {
                    countOfDivisors++;
                    sum += i;
                    if(i*i != num)
                    {
                        countOfDivisors++;
                        sum += num/i;
                    }
                }
                if(countOfDivisors>4) break;
            }
            if(countOfDivisors == 4) totalSum += sum;
        }
        return totalSum;
    }
}
