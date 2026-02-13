// Problem: 496. Next Greater Element I
// Link: https://leetcode.com/problems/next-greater-element-i/
//
// Approach (Monotonic Stack + HashMap):
// - Use a stack to find the next greater element for each value in nums2.
// - Traverse nums2 from left to right:
//     • While stack is not empty AND stack.peek() < current number:
//         - Pop the element from stack.
//         - Map it to the current number (its next greater element).
//     • Push current number onto stack.
// - At the end, elements left in stack have no next greater element.
//
// - Traverse nums1:
//     • Replace each element with its mapped next greater value.
//     • If not found in map, return -1.
//
// Time Complexity: O(n + m)
//     - n = nums1.length
//     - m = nums2.length
//     - Each element processed at most once.
// Space Complexity: O(m) — stack and hashmap storage.

class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums2)
        {
            while(!stack.isEmpty() && stack.peek() < num)
            {
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}
