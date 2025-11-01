// Problem: 206. Reverse Linked List
// Link: https://leetcode.com/problems/reverse-linked-list/
// Approach:
// - The task is to reverse a singly linked list.
// - Use three pointers to iteratively reverse the links:
//     • `prev` → stores the previous node (initially null)
//     • `curr` → points to the current node being processed
//     • `next` → temporarily stores the next node to maintain the traversal
// - At each step:
//     1. Save the next node (`next = curr.next`)
//     2. Reverse the link (`curr.next = prev`)
//     3. Move `prev` and `curr` one step forward
// - When the traversal ends, `prev` will be the new head of the reversed list.
// Time Complexity: O(n) — each node is visited once.
// Space Complexity: O(1) — constant extra space (in-place reversal).

class Solution 
{
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
