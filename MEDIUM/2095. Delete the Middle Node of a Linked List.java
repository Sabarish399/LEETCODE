// Problem: 2095. Delete the Middle Node of a Linked List
// Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Approach:
// - Use the slow and fast pointer technique to locate the middle node.
// - `slow` moves one step at a time, `fast` moves two steps at a time.
// - Maintain a reference such that when `fast` reaches the end, `slow` will be just before the middle node.
// - Remove the middle node by skipping it: `slow.next = slow.next.next`.
// - Handle edge cases where the list has only one node — return null in that case.
// Time Complexity: O(n) — single pass through the list.
// Space Complexity: O(1) — constant extra space.


class Solution {
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
