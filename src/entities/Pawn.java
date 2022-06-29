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
// or if piece at tile y + 1 and x+-1 is != piece.color