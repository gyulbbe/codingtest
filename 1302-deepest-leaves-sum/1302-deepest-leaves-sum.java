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
    int deepestDepth;
    int deepestVal;

    public int deepestLeavesSum(TreeNode root) {
        findDeepestDepth(root, 0);
        findDeepestVal(root, 0);
        return deepestVal;
    }

    public void findDeepestVal(TreeNode treeNode, int treeNodeDepth) {
        if (treeNode == null) {
            return;
        }

        treeNodeDepth++;
        if (deepestDepth == treeNodeDepth) {
            deepestVal += treeNode.val;
        }

        findDeepestVal(treeNode.left, treeNodeDepth);
        findDeepestVal(treeNode.right, treeNodeDepth);
    }

    public void findDeepestDepth(TreeNode treeNode, int treeNodeDepth) {
        if (treeNode == null) {
            return;
        }

        treeNodeDepth++;
        if (deepestDepth < treeNodeDepth) {
            deepestDepth = treeNodeDepth;
        }

        findDeepestDepth(treeNode.left, treeNodeDepth);
        findDeepestDepth(treeNode.right, treeNodeDepth);
    }
}