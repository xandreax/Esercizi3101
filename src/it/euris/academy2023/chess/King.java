package it.euris.academy2023.chess;

public class King extends Piece {
    //RE
    public King(int x, int y) {
        super(x, y);
    }

    @Override
    protected boolean validate(int x, int y) {
        return (x <= this.x + 1 && x >= this.x - 1) && (y <= this.y + 1 && y >= this.y - 1);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
