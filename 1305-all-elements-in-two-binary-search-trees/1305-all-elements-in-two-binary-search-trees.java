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
 // 1. 투포인터 활용한 방법
class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> sortedList1 = dfs(root1, new ArrayList<>());
        List<Integer> sortedList2 = dfs(root2, new ArrayList<>());
        System.out.println(sortedList1);
        System.out.println(sortedList2);
        mergeList(sortedList1, sortedList2);
        return result;
    }
    private List<Integer> dfs(TreeNode node, List<Integer> list) {
        if(node == null) {
            return null;
        }

        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
        
        return list;
    }
    private void mergeList(List<Integer> list1, List<Integer> list2) {
        int p1 = 0;
        int p2 = 0;
        while (list1 != null && list2 != null && p1 < list1.size() && p2 < list2.size()) {
            if(list1.get(p1) <= list2.get(p2)) {
                result.add(list1.get(p1));
                p1++;
            } else {
                result.add(list2.get(p2));
                p2++;
            }
        }

        while (list1 != null && p1 < list1.size()) {
            result.add(list1.get(p1));
            p1++;
        }

        while (list2 != null && p2 < list2.size()) {
            result.add(list2.get(p2));
            p2++;
        }
    }
}