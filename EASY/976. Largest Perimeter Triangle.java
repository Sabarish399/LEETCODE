// Problem: 976. Largest Perimeter Triangle
// Link: https://leetcode.com/problems/largest-perimeter-triangle/
// Approach: Sort the array. Then, starting from the largest side, check triplets in descending order. 
//           If the triangle inequality (a + b > c) holds, return the perimeter. Otherwise, continue. 
//           If no valid triangle exists, return 0.
// Time Complexity: O(n log n), due to sorting.
// Space Complexity: O(1), ignoring sorting space (in-place)

class Solution 
{
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);

        for(int i=nums.length-1;i>=2;i--)
        {
            int a = nums[i-2];
            int b = nums[i-1];
            int c = nums[i];

            if(a+b>c)
                return a+b+c;
        }
        return 0;
    }
}
