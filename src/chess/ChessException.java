package src.chess;

import src.Board.BoardException;

public class ChessException extends BoardException {
    
    @SuppressWarnings("unused")
    private static final long serialVerstionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
