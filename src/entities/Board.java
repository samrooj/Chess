package entities;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Board {
    private Tile[][] chessBoard;

    public Board() {
        initializeBoard();
        initializePieces();
    }

    public void initializeBoard(){
        chessBoard = new Tile[][]{{new Tile('a', 8, null)}};

    }

    public void initializePieces(){
        for(int i = 0; i < 8; i++){
            // Pawn pawn = new

        }
    }




}
