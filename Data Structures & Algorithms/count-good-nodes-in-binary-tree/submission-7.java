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
    private int count = 0;
    public int goodNodes(TreeNode root) {
        int count = 0;
        helper(root, Integer.MIN_VALUE);
        return this.count;
    }

    public void helper(TreeNode node, int max) {
        int newMax = max;
        if (node == null) return;
        if (node.val >= max) {
            this.count++;
            newMax = node.val;
        }
        helper(node.left, newMax);
        helper(node.right, newMax);
    }
}
