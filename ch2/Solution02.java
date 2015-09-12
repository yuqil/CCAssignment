package LinkedListNode;

import treeNode.Node;

public class Solution02 {
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
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(1);
		n.appendToTail(0);
		n.appendToTail(3);
		n.appendToTail(2);
		n.appendToTail(2);
		int N = 4;
		Node temp = returnNth(n, N);
		temp.print();
	}

}
