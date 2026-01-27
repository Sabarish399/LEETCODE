// Problem: 2. Add Two Numbers
// Link: https://leetcode.com/problems/add-two-numbers/
// Approach:
//   Use a dummy head node to simplify list construction.
//   Traverse both linked lists digit by digit, along with a carry value.
//   At each step, add corresponding digits and the carry,
//   create a new node with (sum % 10), and update carry = sum / 10.
//   Continue until both lists are exhausted and no carry remains.
// Time Complexity: O(max(m, n))
// Space Complexity: O(max(m, n)) — output list

class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode temp = new ListNode();
        ListNode ans = temp;

        int sum = 0 , carry = 0;

        while(l1 != null || l2 != null || carry != 0)
        {
            sum = carry;

            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }

            temp.next = new ListNode(sum%10);
            temp = temp.next;

            carry = sum / 10;
        }
        return ans.next;
    }
}
