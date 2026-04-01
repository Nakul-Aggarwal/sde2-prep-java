public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // TODO: Implement insert
    public void insert(String word) {
        // TODO: Implement
    }

    // TODO: Implement search
    public boolean search(String word) {
        // TODO: Implement
        return false;
    }

    // TODO: Implement startsWith
    public boolean startsWith(String prefix) {
        // TODO: Implement
        return false;
    }

    private class TrieNode {
        private TrieNode[] children;
        private boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }
}