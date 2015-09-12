
 
public class Solution05 {

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode start = dummy;
        int carry = 0;
        int sum = 0;
        
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = 0;
            if (sum > 9) {
                carry = 1;
                sum -= 10;
            }
            
            dummy.next = new ListNode(sum);
            dummy = dummy.next;
            sum = 0;
        }
        
        if (carry == 1) {
            dummy.next = new ListNode(1);
        }
        
        return start.next;
    }
}