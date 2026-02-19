// Problem: 287. Find the Duplicate Number
// Link: https://leetcode.com/problems/find-the-duplicate-number/
//
// Approach (Floyd’s Cycle Detection):
// - Treat the array as a linked list:
//     • Index → node
//     • Value at index → next pointer
// - Since one number is duplicated, a cycle must exist.
//
// Step 1: Detect cycle
//     • Initialize slow = nums[0], fast = nums[0].
//     • Move slow by 1 step: slow = nums[slow].
//     • Move fast by 2 steps: fast = nums[nums[fast]].
//     • Continue until they meet.
//
// Step 2: Find cycle entrance
//     • Reset slow to nums[0].
//     • Move both slow and fast one step at a time.
//     • The point where they meet again is the duplicate number.
//
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int slow = nums[0];
        int fast = nums[0];

        while(true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        slow = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
