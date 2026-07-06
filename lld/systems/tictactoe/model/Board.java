package lld.systems.tictactoe.model;

public class Board {
    
    private int size;
    private Cell[][] cells;
    private int movesPlayed;

    public Board(int size) {
        this.size = size;
        cells = new Cell[size][size];
        this.movesPlayed = 0;

        for(int row = 0; row<size; row++) {
            for(int col=0; col<size; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    public boolean placeMove(int row, int col, Player player) {
        if(row >= size || row < 0 || col >= size || col < 0) {
            System.out.println("Row and col should be within the range: 0-" + this.size);
            return false;
        }

        Cell currentCell = cells[row][col];
        if(!currentCell.isAvailable()) {
            System.out.println("Selected cell is already occupied.");
            return false;
        }

        currentCell.occupy(player.getSymbol());
        movesPlayed++;
        return true;
    }

    public boolean isDraw() {
        return this.movesPlayed == size*size;
    }

    public void printBoard() {
        for(int row=0; row<size; row++) {
            for(int col=0; col<size; col++) {
                Cell currentCell = cells[row][col];
                String currentSymbol = currentCell.isAvailable() ? " " : currentCell.getSymbol().toString();

                System.out.print("| " + currentSymbol + " ");
            }
            System.out.println("|");
        }

        System.out.println("________________________");
    }

    public boolean isWinner(int row, int col, Symbol symbol) {
        
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // check row
        for(int i=0; i<size; i++) {
            Cell currentCell = cells[row][i];
            if(currentCell.isAvailable() || !currentCell.getSymbol().equals(symbol)) {
                rowMatch = false;
                break;
            }
        }

        // check column
        for(int i=0; i<size; i++) {
            Cell currentCell = cells[i][col];
            if(currentCell.isAvailable() || !currentCell.getSymbol().equals(symbol)) {
                columnMatch = false;
                break;
            }
        }

        // check diagonal
        for(int i=0; i<size; i++) {
            Cell currentCell = cells[i][i];
            if(currentCell.isAvailable() || !currentCell.getSymbol().equals(symbol)) {
                diagonalMatch = false;
                break;
            }
        }

        //check antiDiagonal
        for(int i=0; i<size; i++) {
            Cell currentCell = cells[i][size-i-1];
            if(currentCell.isAvailable() || !currentCell.getSymbol().equals(symbol)) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
