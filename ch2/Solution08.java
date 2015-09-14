public class Solution08 {
	public static class Node {
		int val;
		Node next;	
		public Node(int x) { val = x; }
	}

	public static Node findLoop(Node n) {
		if (n==null || n.next == null) return null;
		Node n1 = n.next;
		Node n2 = n.next.next;
		while (n1 != n2 && n2.next != null && n2 != null) {
			n1 = n1.next;
			n2 = n2.next.next;
		}
		if(n2 == null || n2.next == null) return null;
		n1 = n;
		while (n1 != n2) {
			n1 = n1.next;
			n2 = n2.next;
		}
		return n1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(0);
		Node n2 = new Node(1);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(4);
		Node n6 = new Node(5);
		Node n7 = new Node(6);
		n7.next = n4;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n1.next = n2;
		Node r = findLoop(n1);
		System.out.println(r.val);
	}

}
