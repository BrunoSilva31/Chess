package src.Board;

public class BoardException extends RuntimeException {
    
    @SuppressWarnings("unused")
    private static final long serialVerstionUID = 1L;

    public BoardException(String msg) {
        super(msg);
    }
}
