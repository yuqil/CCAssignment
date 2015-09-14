
public class Solution06 {
   public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
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
    
    public static ListNode reverseList(ListNode head) {
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
    
    public static boolean isPalindrome(ListNode head) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(6);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(5);
		ListNode n7 = new ListNode(6);
		n7.next = n6;
		n6.next = n5;
		n5.next = n4;
		n4.next = n3;
		n3.next = n2;
		n2.next = n1;
		System.out.println((isPalindrome(n7) == true? " true" : "false"));
		n2.next = null;
		System.out.println((isPalindrome(n7) == true? " true" : "false"));
	}


}
