package chess.chess.pieces;

import chess.boardgame.Board;
import chess.chess.ChessPiece;
import chess.chess.Color;

public class King extends ChessPiece {


    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
