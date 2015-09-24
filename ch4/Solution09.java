import java.util.*;

class BSTSequence{
	public LinkedList<LinkedList<Integer>> BST2Sequence (TreeNode root) {
		LinkedList<LinkedList<Integer>> list = new LinkedList<>()
		if (root == null) {
			return list;
		}
		LinkedList<Integer> left = BST2Sequence(root.left);
		LinkedList<Integer> right = BST2Sequence(root.right);
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		int firstNode = root.val;
		prefix.add(firstNode);
		merge(left, right, prefix, list);
		return list;
	}

	public void merge (LinkedList<Integer> left,
		LinkedList<Integer> right, LinkedList<Integer> prefix,
		LinkedList<LinkedList<Integer>> list) {
		if (left.size() == 0) {
			LinkedList<Integer> result = new LinkedList<Integer>(prefix);
			result.addAll(right);
			results.add(result);
			return;
		} else if (right.size() == 0) {
			LinkedList<Integer> result = new LinkedList<Integer>(prefix);
			result.addAll(left);
			results.add(result);
			return;
		}

		int leftFirst = left.remove(0);
		prefix.addLast(leftFirst);
		merge(left, right, prefix, list);
		left.addFirst(leftFirst);
		prefix.removeLast();

		int rightFirst = right.remove(0);
		prefix.addLast(rightFirst);
		merge(left, right, prefix, list);
		right.addFirst(rightFirst);
		prefix.removeLast();
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution09 {

}