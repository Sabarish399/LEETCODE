// Problem: 1299. Replace Elements with Greatest Element on Right Side
// Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
//
// Approach:
// - Traverse the array from right to left.
// - Maintain a variable `max` to track the maximum element seen so far.
// - Initialize max = last element.
// - Set last element to -1.
// - For each index from n-2 down to 0:
//     • Store current value in temp.
//     • Replace arr[i] with max.
//     • Update max = max(max, temp).
// - Return modified array.
//
// Time Complexity: O(n)
// Space Complexity: O(1) — in-place modification.

class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int n = arr.length;

        int max = arr[n - 1];
        arr[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = max;

            if (max < temp)
                max = temp;
        }

        return arr;
    }
}
