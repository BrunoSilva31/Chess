package src.app;

import java.util.Scanner;

import src.chess.ChessMatch;
import src.chess.ChessPiece;
import src.chess.ChessPosition;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

       ChessMatch chessMatch = new ChessMatch();

       while (true) {
           UI.printBoard(chessMatch.getPieces());

           System.out.println();
           System.out.print("Source: ");
           ChessPosition source = UI.readChessPosition(sc);

           System.out.println();
           System.out.print("Target: ");
           ChessPosition target = UI.readChessPosition(sc);

           @SuppressWarnings("unused")
        ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
       }
    }
}