// Problem: 328. Odd Even Linked List
// Link: https://leetcode.com/problems/odd-even-linked-list/
// Approach:
// - The goal is to rearrange the linked list so that all nodes at odd indices
//   come before nodes at even indices, preserving their original relative order.
// - Use two pointers:
//     • `odd` → tracks the current node in the odd list
//     • `even` → tracks the current node in the even list
// - Maintain a reference to the start of the even list (`evenHead`) 
//   so it can be attached after the last odd node at the end.
// - Traverse while `even` and `even.next` are not null:
//     • Link odd nodes together: `odd.next = odd.next.next`
//     • Link even nodes together: `even.next = even.next.next`
// - Finally, connect the last odd node to the head of the even list.
// - Edge cases: if the list is empty or has only one node, return it as-is.
// Time Complexity: O(n) — each node is visited once.
// Space Complexity: O(1) — constant extra space.


class Solution 
{
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null || head.next==null) return head;

        ListNode odd = head , even = head.next , evenHead = even;
        while(even != null && even.next != null)
        {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    } 
}
