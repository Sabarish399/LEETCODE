// Problem: 326. Power of Three
// Link: https://leetcode.com/problems/power-of-three/
// Approach:
//   The maximum power of 3 that fits in a 32-bit signed integer is 3^19 = 1162261467.
//   If n is a power of three, it must divide this maximum value evenly.
//   Also ensure n > 0 to exclude non-positive numbers.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public boolean isPowerOfThree(int n) 
    {
        int max = 1162261467;
        return n>0 && max%n == 0;
    }
}
