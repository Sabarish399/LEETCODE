// Problem: 876. Middle of the Linked List
// Link: https://leetcode.com/problems/middle-of-the-linked-list/
// Approach: Use two pointers. Move slow by 1 step and fast by 2 steps. When fast reaches the end, slow will be at the middle node.
// Time Complexity: O(n)
// Space Complexity: O(1)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) 
    {
        ListNode slow =head ,fast = head;
        while(fast !=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  
    }
}
