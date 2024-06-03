package src.app;

import src.Board.Board;
import src.Board.Position;
import src.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        
       ChessMatch chessMatch = new ChessMatch();

       UI.printBoard(chessMatch.getPieces());
    }
}