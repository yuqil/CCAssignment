
public class Solution03 {
	public static class ListNode {
		int val;
		ListNode next;
		public ListNode(int num) {
			val = num;
		}
	}

	public static ListNode findMid(ListNode head) {
        	ListNode slow = head;
        	ListNode fast = head.next;
        	while (fast != null && fast.next != null) {
          	 slow = slow.next;
       	    	 fast = fast.next.next;
       		}
         	return slow;
        }

	public static ListNode deleteMid(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode
		mid = findMid(dummy);
		mid.next = mid.next.next;

		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n = new ListNode(0);
		ListNode dummy = n;
		n.next = new ListNode(1);
		n = n.next;
		n.next = new ListNode(1);
		n = n.next;
		for (int i = 1; i < 10; i ++) {
			n.next = new ListNode(i);
			n = n.next;
		}
		ListNode mid = findMid(dummy);
		while(dummy != null) {
			System.out.println(dummy.val);
			dummy = dummy.next;
		}
		System.out.println(mid.val);
		
	}
	
}
