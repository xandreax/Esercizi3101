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

        ChessBoard board = new ChessBoard();
        Piece rook = new Rook(0, 0);
        Piece bishop = new Bishop(2, 0);
        Piece king = new King(4, 0);

        board.add(rook, p -> p.move(4, 5)); //false      no
        board.add(rook, p -> p.move(0, 5) && p.move(5, 5)); //true    this
        board.add(new Rook(7, 0), p -> p.move(7, 7) && p.move(7, 5)); //true    this

        board.add(bishop, p -> p.move(4, 2)); //true     no
        board.add(bishop, p -> p.move(6, 4) && p.move(6, 6)); //false     this
        board.add(new Bishop(5, 0), p -> p.move(7, 2)); //true    this

        board.add(king, p -> p.move(4, 1) && p.move(4, 2)); //true    no
        board.add(king, p -> p.move(6, 2)); //false      this
        board.add(new King(5, 7), p -> p.move(6, 7)); // true    this

        board.startGame();

        /*
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
        */

    }
}
