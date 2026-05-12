// Problem: 1608. Special Array With X Elements Greater Than or Equal X
// Link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
//
// Approach (Binary Search on Answer):
// - We need to find an integer x such that:
//     • exactly x elements are >= x
// - Possible values of x lie in range [0, n].
// - Use binary search on x:
//     • Count how many elements are >= mid.
//     • If count == mid → found answer.
//     • If count > mid → need larger x.
//     • Else → need smaller x.
// - Return -1 if no valid x exists.
//
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution 
{
    public int specialArray(int[] nums) 
    {
        int left = 0, right = nums.length;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            int count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] >= mid)
                    count++;
            }
            if(count == mid) return mid;
            else if(count > mid) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
}
