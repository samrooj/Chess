package entities;

import java.util.ArrayList;

public abstract class Piece implements Movable {
    protected Piece piece;
    protected int color; // white = 0, black = 1
    protected int value;

    public Piece(Piece piece, int color, int value) {
        this.piece = piece;
        this.color = color;
        this.value = value;
    }

    public int getColor(){
        return this.color;
    }

}
