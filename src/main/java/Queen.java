import javax.swing.ImageIcon;
import java.util.ArrayList;
// import java.awt.Color;
// -------------------------------------------------------------------------

/**
 * Represents a Queen game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class Queen
        extends ChessGamePiece {
    // ----------------------------------------------------------

    /**
     * Create a new Queen object.
     *
     * @param board the board the queen is on
     * @param row   the row location of the queen
     * @param col   the column location of the queen
     * @param color either GamePiece.WHITE, BLACK, or UNASSIGNED
     */
    public Queen(ChessGameBoard board, int row, int col, int color) {
        super(board, row, col, color);
    }

    /**
     * Calculates the possible moves for this Queen.
     *
     * @param board the board to check on
     * @return ArrayList<String> the list of moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        ArrayList<String> northEastMovesQueen = calculateNorthEastMoves(board, 8);
        ArrayList<String> northWestMovesQueen = calculateNorthWestMoves(board, 8);
        ArrayList<String> southEastMovesQueen = calculateSouthEastMoves(board, 8);
        ArrayList<String> southWestMovesQueen = calculateSouthWestMoves(board, 8);
        ArrayList<String> northMovesQueen = calculateNorthMoves(board, 8);
        ArrayList<String> southMovesQueen = calculateSouthMoves(board, 8);
        ArrayList<String> eastMovesQueen = calculateEastMoves(board, 8);
        ArrayList<String> westMovesQueen = calculateWestMoves(board, 8);
        ArrayList<String> allMovesQueen = new ArrayList<>();
        allMovesQueen.addAll(northEastMovesQueen);
        allMovesQueen.addAll(northWestMovesQueen);
        allMovesQueen.addAll(southWestMovesQueen);
        allMovesQueen.addAll(southEastMovesQueen);
        allMovesQueen.addAll(northMovesQueen);
        allMovesQueen.addAll(southMovesQueen);
        allMovesQueen.addAll(westMovesQueen);
        allMovesQueen.addAll(eastMovesQueen);
        return allMovesQueen;
    }

    /**
     * Creates an icon for this piece depending on the piece's color.
     *
     * @return ImageIcon the ImageIcon representation of this piece.
     */
    @Override
    public ImageIcon createImageByPieceType() {
        if (getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhiteQueen.gif")
            );
        } else if (getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackQueen.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/default-Unassigned.gif")
            );
        }
    }
}
