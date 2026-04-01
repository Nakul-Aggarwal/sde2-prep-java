public class FlattenBinaryTreeToLinkedList {
    // TODO: Implement Flatten Binary Tree to LL
    // Problem: Given the root of a binary tree, flatten the tree into a "linked list".

    // Pseudo code:
    // - Use recursion or stack
    // - Flatten right subtree, then left
    // - Connect root.right to flattened left, then to flattened right

    public void flatten(TreeNode root) {
        // TODO: Implement
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