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
    int level = 0;
    public TreeNode reverseOddLevels(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()) {
            List<TreeNode> currentLevel = new ArrayList<>();
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                currentLevel.add(node);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            if (level % 2 == 1) {
                int currentSize = currentLevel.size();
                List<Integer> list = new ArrayList<>();
                for (TreeNode n : currentLevel) {
                    list.add(n.val);
                }
                Collections.reverse(list);
                for (int i = 0; i < currentSize; i++) {
                    currentLevel.get(i).val = list.get(i);
                }
            }
            level++;
        }
        return root;
    }
}