// Problem: 19. Remove Nth Node From End of List
// Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Approach:
//   Use the two-pointer technique.
//   Advance the fast pointer n steps ahead.
//   If the fast pointer becomes null, the node to remove is the head.
//   Otherwise, move both pointers until the fast pointer reaches the end.
//   Adjust the next pointer of the slow pointer to skip the target node.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp = head;
        ListNode temp1 = head;

        for(int i=0;i<n;i++)
            temp1 = temp1.next;

        if(temp1 == null) return head.next;

        while(temp1.next != null)
        {
           temp1 = temp1.next;
           temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
