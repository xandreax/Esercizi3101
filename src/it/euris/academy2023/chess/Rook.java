package it.euris.academy2023.chess;

public class Rook extends Piece {
    //TORRE
    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    protected boolean validate(int x, int y) {
        return x == this.x || y == this.y;
    }
}
