package it.euris.academy2023.chess;

import java.util.Objects;

public abstract class Piece {

    protected int x;
    protected int y;

    public Piece(int x, int y) {
        if (!checkCoordinates(x, y)) {
            throw new RuntimeException("Exception: coordinates must be between 0 and 8");
        }
        this.x = x;
        this.y = y;
    }

    protected abstract boolean validate(int x, int y);

    public final boolean move(int x, int y) {
        if (!checkCoordinates(x, y) || !validate(x, y))
            return false;
        this.x = x;
        this.y = y;
        return true;
    }

    protected static boolean checkCoordinates(int x, int y) {
        return x >= 0 && x <= 7 && y >= 0 && y <= 7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return x == piece.x && y == piece.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass().getName(), x, y);
    }
}
