package lld.systems.tictactoe;

import lld.systems.tictactoe.service.Game;

public class Main {
    
    public static void main(String args[]) {
        Game game = new Game();
        game.initializeGame();
        game.playGame();
    }
}
