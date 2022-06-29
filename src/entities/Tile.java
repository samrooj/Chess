package entities;

public class Tile {
    protected char x_location;
    protected int y_location;
    protected Piece piece;

    /**
     * Creates a new Tile.
     *
     * @param x_location  The x location of the Tile on the board.
     * @param y_location  The y location of the Tile on the board.
     * @param piece The piece at the Tile.
     */
    public Tile(char x_location, int y_location, Piece piece){
        this.x_location = x_location;
        this.y_location = y_location;
        this.piece = piece;
    }

    /**
     * Creates a new Tile without a piece at the Tile.
     *
     * @param x_location  The x location of the Tile on the board.
     * @param y_location  The y location of the Tile on the board.
     */
    public Tile(char x_location, int y_location){
        this.x_location = x_location;
        this.y_location = y_location;
        this.piece = null;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }

    public void setNull(){
        this.piece = null;
    }

    public Piece atTile(Tile tile){
        return this.piece;
    }

    public void changeXLocation(char newXLocation){
        this.x_location = newXLocation;
    }

    public void changeYLocation(int newYLocation){
        this.y_location = newYLocation;
    }
}
