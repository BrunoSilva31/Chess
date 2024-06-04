package src.chess;

public class ChessException extends RuntimeException {
    
    @SuppressWarnings("unused")
    private static final long serialVerstionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
