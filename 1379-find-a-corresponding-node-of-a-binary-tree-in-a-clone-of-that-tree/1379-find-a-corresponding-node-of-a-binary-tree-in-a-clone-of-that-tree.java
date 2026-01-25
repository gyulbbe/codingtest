/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    int location;
    int snapshot;
    TreeNode resultNode;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        findTarget(original, target);
        location = 0;
        findClonedTarget(cloned);
        return resultNode;
    }
    public void findTarget(TreeNode node, TreeNode target) {
        if (node == null) {
            return ;
        }

        location++;
        if (node == target) {
            snapshot = location;
        }

        findTarget(node.left, target);
        findTarget(node.right, target);
    }
    public void findClonedTarget(TreeNode node) {
        if (node == null) {
            return ;
        }

        location++;
        if (snapshot == location) {
            resultNode = node;
        }

        findClonedTarget(node.left);
        findClonedTarget(node.right);
    }
}