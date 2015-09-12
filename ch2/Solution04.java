
public class Solution04 {
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
 
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode dummy = left;
        ListNode dummy_right = right;
        
        while (head != null) {
            if (head.val > x) {
                right.next = head;
                right = right.next;
            } else if (head.val <= x) {
                left.next = head;
                left = left.next;
            } 
            head = head.next;
        }
        right.next = null;
        left.next = dummy_right.next;
        
        return dummy.next;
    }
}