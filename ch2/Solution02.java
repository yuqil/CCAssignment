public class Solution02 {
	public static class Node {
		int val;
		Node next;	
		public Node(int x) { val = x; }
	}

	public static Node returnNth(Node n, int N) {
		Node temp = n;
		int len = 0;
		while(temp != null) {
			temp = temp.next;
			len ++;
		}
		if (len < N) return null;
		len = len - N;
		temp = n;
		for (int i = 0; i<len; i++) {
			temp = temp.next;
		}
		return temp;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(0);
		Node start = n;
		n.next = new Node(1);
		n = n.next;
		n.next = new Node(1);
		n = n.next;
		n.next = new Node(2);
		n = n.next;
		n.next = new Node(3);
		n = n.next;
		n.next = new Node(4);
		n = n.next;
		n.next = new Node(6);
		n = n.next;
		int N = 4;
		Node temp = returnNth(start, N);
		System.out.println(temp.val);
	}

}
