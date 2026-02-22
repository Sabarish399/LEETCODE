// Problem: 762. Prime Number of Set Bits in Binary Representation
// Link: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
//
// Approach:
// - For each number from left to right:
//     • Compute number of set bits using Integer.bitCount(i).
//     • Check if that count is prime using helper function isPrime().
//     • If prime, increment counter.
// - Return total count.
//
// isPrime(p):
// - If p < 2 → return false.
// - Check divisibility from 2 to sqrt(p).
// - If divisible → not prime.
// - Otherwise → prime.
//
// Time Complexity: O(n * sqrt(k))
//     - n = right - left + 1
//     - k = maximum number of set bits (at most 32 for int)
// Space Complexity: O(1)

class Solution 
{
    static boolean isPrime(int p)
    {
        if(p < 2) return false;
        for(int i=2;i*i<=p;i++)
        {
            if(p%i==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) 
    {
        int cnt=0;
        for(int i=left;i<=right;i++)
        {
            if(isPrime(Integer.bitCount(i))) cnt++;
        }
        return cnt;
    }
}
