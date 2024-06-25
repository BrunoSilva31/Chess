package src.chess;

import src.Board.Board;
import src.Board.Piece;

public abstract class ChessPiece extends Piece {
    private Color color;
    
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }


    public Color getColor() {
        return color;
    }
    
}
