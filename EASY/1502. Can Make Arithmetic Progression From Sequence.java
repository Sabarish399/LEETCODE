// Problem: 1502. Can Make Arithmetic Progression From Sequence
// Link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
// Approach:
//   Sort the array.
//   Compute the common difference using the first two elements.
//   Verify that every consecutive pair has the same difference.
//   If any difference mismatches, an arithmetic progression is impossible.
// Time Complexity: O(n log n)
// Space Complexity: O(1) ignoring sorting overhead

class Solution 
{
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
        if(arr.length == 2) return true;

        Arrays.sort(arr);

        for(int i=1;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i]-arr[i-1]) == Math.abs(arr[i] - arr[i+1]))
            return true;
        }
        return false;
    }
}
