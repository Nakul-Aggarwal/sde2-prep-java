package lld.systems.tictactoe.service;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import lld.systems.tictactoe.model.Board;
import lld.systems.tictactoe.model.Player;
import lld.systems.tictactoe.model.Symbol;

public class Game {

    private Board board;
    Deque<Player> players = new LinkedList<>();
    Player winner;
    Scanner sc = new Scanner(System.in);

    public void initializeGame() {
        System.out.println("Enter name of first player: ");
        String playerName1 = sc.nextLine();
        System.out.println("Enter name of second player: ");
        String playerName2 = sc.nextLine();

        players.add(new Player(playerName1, Symbol.O));
        players.add(new Player(playerName2, Symbol.X));

        board = new Board(3);
        winner = null;
        board.printBoard();
    }

    public void playGame() {
        while(winner == null) {
            Player playingPlayer = players.pollFirst();

            System.out.println(playingPlayer.getName() + "'s turn:");
            System.out.println("Please enter row and col for your next move");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(!board.placeMove(row, col, playingPlayer)) {
                System.out.println("Please try again");
                players.offerFirst(playingPlayer);
                board.printBoard();
                continue;
            }

            if(board.isWinner(row, col, playingPlayer.getSymbol())) {
                winner = playingPlayer;
                System.out.println(playingPlayer.getName() + " won the game");
                return;
            }

            if (board.isDraw()) {
                System.out.println("No Available moves, It's a draw");
                return;
            }

            board.printBoard();
            players.offerLast(playingPlayer);
        }

    }
}
