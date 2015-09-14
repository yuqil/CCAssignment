
import java.util.Hashtable;

public class Solution01 {
    private static class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }
	
	public static void removeDuplicate(Node n) {
		if (n == null) return;
		Node temp = n;
		while(temp.next != null) {
			n = temp;
			while(n.next != null) {
				if(temp.val == n.next.val){
					n.next = n.next.next;
				}
				else n = n.next;
			}
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(0);
		Node dummy = n;
		n.next = new Node(1);
		n = n.next;
		n.next = new Node(1);
		n = n.next;
		for (int i = 1; i < 10; i ++) {
			n.next = new Node(i);
			n = n.next;
		}
		removeDuplicate(dummy);
		while(dummy != null) {
			System.out.println(dummy.val);
			dummy = dummy.next;
		}
		
	}

}
