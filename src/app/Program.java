package src.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import src.chess.ChessException;
import src.chess.ChessMatch;
import src.chess.ChessPiece;
import src.chess.ChessPosition;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

       ChessMatch chessMatch = new ChessMatch();

       while (true) {

        try{
            UI.clearScreen();
    
            UI.printBoard(chessMatch.getPieces());
    
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            boolean[][] possibleMoves = chessMatch.possibleMoves(source);
            UI.clearScreen();
            UI.printBoard(chessMatch.getPieces(), possibleMoves);
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
    
            @SuppressWarnings("unused")
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

        } catch (ChessException e) {
            System.out.println(e.getMessage());
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            sc.nextLine();

       }
    }
}
}