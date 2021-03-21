package chess.domain.piece.kind;

import chess.domain.Point;
import chess.domain.piece.Color;
import chess.domain.piece.Direction;

import java.util.Optional;

public class Knight extends Piece {
    private static final double KNIGHT_SCORE = 2.5;
    private static final int POSSIBLE_DISTANCE_OF_KNIGHT = 5;
    private static final String KNIGHT_NAME = "n";

    public Knight(Color color, Point point) {
        super(KNIGHT_NAME, color, point);
    }

    @Override
    public Optional<Direction> direction(Piece target) {
        int distance = this.point.calculateDistance(target.point);

        if (distance != POSSIBLE_DISTANCE_OF_KNIGHT) {
            throw new IllegalArgumentException("기물이 이동할 수 없는 경로입니다.");
        }
        return Optional.empty();
    }

    @Override
    public Point moveOneStep(Point target, Direction direction) {
        return target;
    }

    @Override
    public double score() {
        return KNIGHT_SCORE;
    }

    @Override
    public boolean isEmptyPiece() {
        return false;
    }

    @Override
    public boolean isKing() {
        return false;
    }

    @Override
    public boolean isPawn() {
        return false;
    }
}
