// Problem: 1015. Smallest Integer Divisible by K
// Link: https://leetcode.com/problems/smallest-integer-divisible-by-k/
// Approach: A repunit has the form 111...1. We track the remainder when dividing by k.
//           For each added '1': rem = (rem * 10 + 1) % k.
//           If k has any factor of 2 or 5, no repunit can be divisible by k, return -1.
//           Otherwise, within k iterations we must either hit remainder 0 or detect impossibility.
// Time Complexity: O(k)
// Space Complexity: O(1)

class Solution 
{
    public int smallestRepunitDivByK(int k) 
    {
        if(k==1) return 1;
        if(k%2==0 || k%2==0) return -1;

        int rem = 0;
        for(int i=1;i<=k;i++)
        {
            rem = ((rem*10)+1)%k;
            if(rem==0) return i;
        }
        return -1;
    }
}
