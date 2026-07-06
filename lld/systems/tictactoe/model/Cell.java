package lld.systems.tictactoe.model;

public class Cell {

    private int row;
    private int col;
    private Symbol symbol;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.symbol = null;
    }

    public boolean isAvailable() {
        return this.symbol == null;
    }

    public void occupy(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }
}
