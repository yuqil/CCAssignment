package LinkedListNode;
import java.util.Hashtable;

import treeNode.Node;

public class Solution01 {
	public static void removeDuplicate(Node n) {
		if (n == null) return;
		Node temp = n;
		while(temp.next != null) {
			n = temp;
			while(n.next != null) {
				if(temp.data == n.next.data){
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
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(1);
		n.appendToTail(0);
		n.appendToTail(3);
		n.appendToTail(2);
		n.appendToTail(2);
                removeDuplicate(n);
		n.print();
	}

}
