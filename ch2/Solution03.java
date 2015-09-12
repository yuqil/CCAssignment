
public class Solution03 {
	public class ListNode {
		int val;
		ListNode next;
		public ListNode(int num) {
			val = num;
		}
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

	public static deleteMid(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode mid = findMid(dummy);
		mid.next = mid.next.next;

		return dummy.next;
	}
	
}
