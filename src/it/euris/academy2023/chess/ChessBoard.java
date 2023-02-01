package it.euris.academy2023.chess;

import java.util.LinkedHashMap;
import java.util.Map;

public class ChessBoard {

    private Map<Piece, Behavior> pieceBehaviorMap;

    public ChessBoard() {
        pieceBehaviorMap = new LinkedHashMap<>();
    }

    public void add(Piece p, Behavior b) {
        pieceBehaviorMap.put(p, b);
    }

    public void startGame() {
        for (Piece p : pieceBehaviorMap.keySet()) {
            System.out.println(pieceBehaviorMap.get(p).simulate(p));
        }
    }
}
