
public class Solution04 {
   public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
 
    public static ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode dummy = left;
        ListNode dummy_right = right;
        
        while (head != null) {
            if (head.val >= x) {
                right.next = head;
                right = right.next;
            } else if (head.val < x) {
                left.next = head;
                left = left.next;
            } 
            head = head.next;
        }
        right.next = null;
        left.next = dummy_right.next;
        
        return dummy.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n = new ListNode(0);
		ListNode dummy = n;
		ListNode dummy_copy = n;
		n.next = new ListNode(1);
		n = n.next;
		n.next = new ListNode(1);
		n = n.next;
		for (int i = 1; i < 10; i ++) {
			n.next = new ListNode(10 - i);
			n = n.next;
		}
		while(dummy != null) {
			System.out.print(dummy.val + " ");
			dummy = dummy.next;
		}
		System.out.println();
		ListNode start = partition(dummy_copy, 5);
		while(start != null) {
			System.out.print(start.val + " ");
			start = start.next;
		}
		
	}
}
