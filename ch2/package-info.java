/**
 * 
 */
/**
 * @author lyq
 *
 */
package LinkedListNode;

class Node{
	    Node next = null;
	    int data;
		
		public Node(int n) {
			data = n;
		}
		
		void appendToTail(int d){
			Node end = new Node(d);
			Node n = this;
			while(n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
		
		void print() {
			Node n = this;
			while (n.next != null){
				System.out.println(n.data);
			    n = n.next;
			}
			System.out.println(n.data);
		}

	
	
	Node deleteNode(Node head, int d) {
		if (head.data == d) return head.next;
		Node n = head;
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}	
	}		
}