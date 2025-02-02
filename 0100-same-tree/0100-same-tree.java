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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }
    public boolean dfs(TreeNode nodeP, TreeNode nodeQ) {
        // 1. 둘 다 null인 경우 같기 때문에 true
        if (nodeP == null && nodeQ == null) {
            return true;
        }

        // 2. 둘 중 하나만 null인 경우 다르기 때문에 false
        if (nodeP == null || nodeQ == null) {
            return false;
        }

        // 3. 값이 다르면 false
        if (nodeP.val != nodeQ.val) {
            return false;
        }

        // 4. 어느 것도 해당하지 않는 다면 다음 깊이 탐색
        return dfs(nodeP.left, nodeQ.left) && dfs(nodeP.right, nodeQ.right);
    }
}