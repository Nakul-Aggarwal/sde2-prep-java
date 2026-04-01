public class BraceExpansionII {
    // TODO: Implement Brace expansion II
    // Problem: Under the grammar given below, strings can represent a set of lowercase words. Let R(expr) denote the set of words represented by the expression expr.
    // The grammar consists of:
    // - Single letters represent a singleton set containing that word.
    // - R("{") R(letter) R(",") ... R(letter) R("}") represents the union of the words represented by the comma-separated subexpressions.
    // - R(letter) R(letter) ... R(letter) represents the concatenation of represented words.
    // For example, R("{a,b}c") = {"ac","bc"} and R("a{b,c}") = {"ab","ac"}.
    // Return the sorted list of words that the expression represents.

    // Pseudo code:
    // - Recursion

    public List<String> braceExpansionII(String expression) {
        // TODO: Implement
        return new ArrayList<>();
    }
}