package it.euris.academy2023.chess;

public class Bishop extends Piece {
    //ALFIERE
    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    protected boolean validate(int x, int y) {
        return (x - this.x) == (y - this.y);
    }

}
