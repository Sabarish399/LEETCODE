// Problem: 1122. Relative Sort Array
// Link: https://leetcode.com/problems/relative-sort-array/
//
// Approach:
// - Count the frequency of each element in arr1 using a frequency array.
// - Place the elements present in arr2 into arr1 according to their order,
//   using their recorded frequencies.
// - Traverse the remaining values in ascending order and append any leftover
//   elements based on their frequencies.
// - Return the modified arr1 as the relative sorted array.
//
// Time Complexity: O(n + m + k)
//     - n = arr1.length, m = arr2.length, k = 1001 (value range)
// Space Complexity: O(k)

class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int[] freq = new int[1001];

        for(int num : arr1)
        {
            freq[num]++;
        }

        int idx = 0;
        for(int num : arr2)
        {
            int count = freq[num];
            while(count-- > 0)
            {
                arr1[idx++] = num;
            }
            freq[num] = 0;
        }

        for(int i=0;i<freq.length;i++)
        {
            int count = freq[i];
            while(count-- > 0)
            {
                arr1[idx++] = i;
            }
            freq[i]=0;
        }
        return arr1;
    }
}
