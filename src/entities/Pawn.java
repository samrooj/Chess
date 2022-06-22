package entities;

import java.util.ArrayList;

public class Pawn extends Piece implements Movable{

    public Pawn(Piece piece, int color, Tile tile) {
        super(piece, color, tile, 1);
    }

    public ArrayList<String> moves(String location) {
        return null;
    }
}
// if Tile plus one y isempty that is added to move