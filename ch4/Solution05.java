/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        inorder(inorder, root);
        
        int cur = inorder.get(0);
        for (int i = 1; i < inorder.size(); i ++) {
            if (inorder.get(i) <= cur) {
                return false;
            }
            cur = inorder.get(i);
        }
        return true;
    }
    
    
    public void inorder(ArrayList<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }
}
