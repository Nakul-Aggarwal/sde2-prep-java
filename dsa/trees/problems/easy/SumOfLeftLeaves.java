public class SumOfLeftLeaves {
    // TODO: Implement Sum of left leaves
    // Problem: Given the root of a binary tree, return the sum of all left leaves.

    // Pseudo code:
    // - Recursion: if left child is leaf, add its value
    // - Sum of left and right subtrees

    public int sumOfLeftLeaves(TreeNode root) {
        // TODO: Implement
        return 0;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}