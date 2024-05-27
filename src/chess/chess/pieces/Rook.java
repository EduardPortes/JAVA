package chess.chess.pieces;

import chess.boardgame.Board;
import chess.boardgame.Position;
import chess.chess.ChessPiece;
import chess.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
