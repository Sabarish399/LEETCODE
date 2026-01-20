// Problem: 21. Merge Two Sorted Lists
// Link: https://leetcode.com/problems/merge-two-sorted-lists/
// Approach:
//   Use recursion to merge the two sorted linked lists.
//   Compare the head values of both lists:
//     - Attach the smaller node to the result and recursively merge the rest.
//   Base cases handle when either list becomes null.
// Time Complexity: O(m + n) where m and n are lengths of the lists
// Space Complexity: O(m + n) due to recursion stack

class Solution 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val<list2.val) 
        {
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
