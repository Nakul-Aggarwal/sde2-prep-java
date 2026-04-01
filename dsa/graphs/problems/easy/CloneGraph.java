public class CloneGraph {
    // TODO: Implement Clone graph
    // Problem: Given a reference of a node in a connected undirected graph.
    // Return a deep copy (clone) of the graph.
    // Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

    // Pseudo code:
    // - DFS or BFS with map

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        // TODO: Implement
        return null;
    }
}