public class BST {
    // TODO: Implement Binary Search Tree

    // Pseudo code:
    // - Insert: recursive, find position
    // - Search: recursive, compare
    // - Delete: handle cases (leaf, one child, two children)
    // - Inorder traversal should give sorted order
    // - Find min, max
    // - Check if BST

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private TreeNode root;

    public BST() {
        root = null;
    }

    // TODO: Implement methods
}