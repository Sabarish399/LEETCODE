// Problem: 69. Sqrt(x)
// Link: https://leetcode.com/problems/sqrtx/
// Approach: Binary Search. Search between 1 and x, check mid*mid <= x to 
//           find the integer square root.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int mySqrt(int x) 
    {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x, ans = 0;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) 
            {
                ans = mid;
                left = mid + 1;
            }
            else 
                right = mid - 1;
        }
        return ans;
    }
}

