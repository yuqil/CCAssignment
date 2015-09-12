
public class Solution {
  Definition for singly-linked list.
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
    public int len(ListNode head) {
        int len = 0;
        while(head != null) {
            len ++;
            head = head.next;
        }
        return len;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = len(headA);
        int lenB = len(headB);
        
        if (lenB > lenA) {
            int dif = lenB - lenA;
            for (int i = 0; i < dif; i ++) {
                headB = headB.next;
            }
        }
        if (lenA > lenB) {
            int dif = lenA - lenB;
            for (int i =0; i < dif; i ++) {
                headA = headA.next;
            }
        }       
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}