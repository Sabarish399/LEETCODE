// Problem: 204. Count Primes
// Link: https://leetcode.com/problems/count-primes/
// Approach: Classic Sieve of Eratosthenes.  
//           Mark multiples of each prime starting from i*i.  
//           Count remaining true values.
// Time Complexity: O(n log log n)
// Space Complexity: O(n)

class Solution
{
    public int countPrimes(int n) 
    {
        if(n<2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<n;i++)
        {
            if(isPrime[i]) 
            {
                for(int j = i*i;j<n;j+=i)
                {
                    isPrime[j] = false;
                }
            }
        }
        int primes=0;
        for(int i=0;i<n;i++)
            if(isPrime[i]) primes++;

        return primes;
    }
}
