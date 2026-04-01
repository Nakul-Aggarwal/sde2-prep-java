public class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // TODO: Implement find with path compression
    public int find(int x) {
        // TODO: Implement
        return 0;
    }

    // TODO: Implement union by rank
    public void union(int x, int y) {
        // TODO: Implement
    }
}