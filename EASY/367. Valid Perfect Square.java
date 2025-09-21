// Problem: 367. Valid Perfect Square
// Link: https://leetcode.com/problems/valid-perfect-square/
// Approach: Use Newton's method (integer version) to approximate the square root. 
//           Start with n = num/2 and iteratively refine until n*n ≤ num. 
//           Finally, check if n*n equals num.
// Time Complexity: O(log n), since Newton’s method converges quickly.
// Space Complexity: O(1), only constant extra space is used.

class Solution 
{
    public boolean isPerfectSquare(int num)
    {
        if(num<2) return true;

        long n = num/2;

        while(n*n > num)
        {
            n = (n+ num/n)/2;
        }
        return n*n == num;
    }
}
