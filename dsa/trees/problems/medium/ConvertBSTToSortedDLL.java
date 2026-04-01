public class ConvertBSTToSortedDLL {
    // TODO: Implement Convert BST to sorted DLL
    // Problem: Convert a Binary Search Tree to a sorted Circular Doubly-Linked List in place.

    // Pseudo code:
    // - Inorder traversal, link nodes

    public Node treeToDoublyList(Node root) {
        // TODO: Implement
        return null;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node() {}
        public Node(int _val) { val = _val; }
        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}