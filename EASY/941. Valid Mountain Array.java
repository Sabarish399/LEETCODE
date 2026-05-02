// Problem: 941. Valid Mountain Array
// Link: https://leetcode.com/problems/valid-mountain-array/
//
// Approach (Two Pointers from Both Ends):
// - A valid mountain array must:
//     • Strictly increase to a peak
//     • Then strictly decrease
// - Use two pointers:
//     • left → move forward while increasing
//     • right → move backward while decreasing
// - Valid if both meet at same index AND not at boundaries.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {
        if(arr.length < 3) return false;
        int left = 0, right = arr.length-1;

        while(left+1 < arr.length-1 && arr[left] < arr[left+1]) left++;
        
        while(right - 1 > 0 && arr[right-1] > arr[right]) right--;

        return left == right;
    }
}
