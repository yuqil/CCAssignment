
public class Solution {
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        
        while (head != null){
            ListNode tmp = head.next;
            head.next = pre;
            
            pre = head;
            head = tmp;
        }
        
        return pre;
    }
    
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        
        ListNode mid = findMid(head);
        ListNode right = reverseList(mid.next);
        mid.next = null;
        
        while (right != null && head != null) {
            if (right.val != head.val) {
                return false;
            }
            head = head.next;
            right = right.next;
        }
        
        return true;
    }
}