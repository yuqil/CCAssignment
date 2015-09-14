
public class Solution07 {

   public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
    public static int len(ListNode head) {
        int len = 0;
        while(head != null) {
            len ++;
            head = head.next;
        }
        return len;
    }
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(7);
		ListNode n2 = new ListNode(8);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(5);
		ListNode n7 = new ListNode(6);
		n7.next = n6;
		n6.next = n5;
		n5.next = n4;
		n4.next = n3;
		n3.next = null;
		n2.next = n1;
		n1.next = n4;
		
		ListNode r = getIntersectionNode(n7, n2);
		System.out.println(r.val);
	}

}
