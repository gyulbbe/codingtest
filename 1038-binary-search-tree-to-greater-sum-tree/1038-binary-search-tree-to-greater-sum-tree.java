/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum;
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        dfs(root);
        return root;
    }
    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.right);
        
        sum += node.val;
        node.val = sum;
        
        dfs(node.left);
    }
}