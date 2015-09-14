
 
public class Solution05 {
    private static class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        
        Node dummy = new Node(-1);
        Node start = dummy;
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
            
            dummy.next = new Node(sum);
            dummy = dummy.next;
            sum = 0;
        }
        
        if (carry == 1) {
            dummy.next = new Node(1);
        }
        
        return start.next;
    }
}
