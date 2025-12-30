// Problem: 167. Two Sum II - Input Array Is Sorted
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Approach:
//   Use two pointers since the array is already sorted.
//   Initialize one pointer at the start and one at the end.
//   If the current sum is less than target, move the left pointer right.
//   If greater, move the right pointer left.
//   If equal, return the 1-based indices.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int left = 0; 
        int right = numbers.length-1;

        while(left<right)
        {
            int sum = numbers[left] + numbers[right];

            if(sum < target)
                left++;
            else if(sum > target)
                right--;
            else
                return new int[]{left+1 , right+1};
        }
        return new int[] {-1,-1};
    }
}
