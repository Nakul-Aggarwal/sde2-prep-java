import java.util.*;

public class Graph {
    // TODO: Implement a graph (adjacency list)

    // Pseudo code:
    // - Use List<List<Integer>> for adjacency list
    // - addEdge(int u, int v): add v to u's list, and u to v's for undirected
    // - DFS: recursive or iterative with stack
    // - BFS: using queue
    // - Topological sort
    // - Detect cycle
    // - Shortest path (Dijkstra, etc.)

    private List<List<Integer>> adjList;
    private int vertices;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // TODO: Implement methods
}