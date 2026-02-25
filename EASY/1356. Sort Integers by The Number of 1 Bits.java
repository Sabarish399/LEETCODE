// Problem: 1356. Sort Integers by The Number of 1 Bits
// Link: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
//
// Approach:
// - Convert int[] to Integer[] because Arrays.sort with comparator
//   works only with objects, not primitives.
// - Sort using custom comparator:
//     • Compare number of set bits using Integer.bitCount().
//     • If set bits are equal, compare numbers normally.
// - Copy sorted values back to original int[].
// - Return the sorted array.
//
// Time Complexity: O(n log n)
//     - Sorting dominates.
//     - bitCount() runs in O(1).
// Space Complexity: O(n)
//     - Extra Integer[] array used.

class Solution 
{
    public int[] sortByBits(int[] arr) 
    {
        Integer res[] = new Integer[arr.length];

        for(int i=0;i<arr.length;i++)
            res[i] = arr[i];

        Arrays.sort(res,(a,b) -> 
        {
            int aBit = Integer.bitCount(a);
            int bBit = Integer.bitCount(b);

            if(aBit==bBit) return a-b;
            return aBit - bBit;
        });

        for(int i=0;i<arr.length;i++)
            arr[i] = res[i];
        return arr;
    }
}
