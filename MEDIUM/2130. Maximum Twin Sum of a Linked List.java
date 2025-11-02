// Problem: 2130. Maximum Twin Sum of a Linked List
// Link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
// Approach:
// - The problem asks for the maximum twin sum in a linked list of even length.
//   (Twin nodes are pairs from opposite ends: first with last, second with second-last, etc.)
//
// Steps:
// 1. **Find the middle** of the list using the fast–slow pointer technique.
//    - `slow` moves one step, `fast` moves two steps.
//    - When `fast` reaches the end, `slow` will be at the midpoint.
// 2. **Reverse the second half** of the linked list starting from `slow`.
//    - This allows easy comparison between first-half and reversed second-half nodes.
// 3. **Calculate twin sums** by traversing both halves together.
//    - At each step, compute the sum of corresponding node values and track the maximum.
// 4. Return the maximum twin sum found.
//
// Time Complexity: O(n) — each node is visited a constant number of times.
// Space Complexity: O(1) — in-place reversal; no extra space used.

class Solution 
{
    public int pairSum(ListNode head) 
    {
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode next = null;
        ListNode prev = null;

        while(slow != null)
        {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        int maxTwin = 0;
        while(prev!=null)
        {
            maxTwin = Math.max(maxTwin,prev.val+head.val);
            prev = prev.next;
            head = head.next;
        }
        return maxTwin;
    }
}
