package it.euris.academy2023.chess;

public class ChessRunner {

    public static void main(String[] args) {

        // test wrong initial coordinates
        /*try {
            Piece p1 = new Bishop(-3, -3);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }*/

        Piece rook = new Rook(0, 0);
        Piece bishop = new Bishop(2, 0);
        Piece king = new King(4, 0);

        System.out.println(rook.move(4,5)); //false
        System.out.println(rook.move(0,5)); //true
        System.out.println(rook.move(5,5)); //true
        System.out.println("------------------------");
        System.out.println(bishop.move(4,2)); //true
        System.out.println(bishop.move(6, 4)); //true
        System.out.println(bishop.move(6,6)); // false
        System.out.println("------------------------");
        System.out.println(king.move(4,1)); //true
        System.out.println(king.move(4,2)); // true
        System.out.println(king.move(6,2)); //false

    }
}
