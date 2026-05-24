// Problem: 237. Delete Node in a Linked List
// Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
//
// Approach:
// - We are NOT given access to the head of the list.
// - So we cannot remove the node traditionally.
// - Instead:
//     • Copy value from next node into current node.
//     • Skip the next node by updating pointers.
// - This effectively deletes the current node.
//
// Time Complexity: O(1)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public void deleteNode(ListNode node) 
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
