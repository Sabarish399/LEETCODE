// Problem: 1051. Height Checker
// Link: https://leetcode.com/problems/height-checker/
//
// Approach (Counting Sort):
// - Heights are in range [1, 100], so use a frequency array.
// - Count frequency of each height.
// - Reconstruct the sorted order using the frequency array.
// - Compare reconstructed order with original array:
//     • If mismatch occurs, increment count.
// - Return total mismatches.
//
// Time Complexity: O(n + k)
//     - n = number of students
//     - k = range (100)
// Space Complexity: O(k) → O(1) since k is constant

class Solution 
{
    public int heightChecker(int[] heights) 
    {
        int[] freq = new int[101];

        for(int i:heights) freq[i]++;

        int count=0;
        int index=0;

        for(int i=1;i<101;i++)
        {
            while(freq[i]>0) 
            {
                if(heights[index] != i) count++;

                index++;
                freq[i]--;
            }
        }
        return count;
    }
}
