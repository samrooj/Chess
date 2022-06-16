package entities;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Boardtest {
    private final JPanel gui = new JPanel(new BorderLayout(3, 3));
    private JButton[][] chessBoardSquares = new JButton[8][8];
    private JPanel chessBoard;

    Boardtest() {
        initializeBoard();
    }

    public void initializeBoard(){
        chessBoard = new JPanel(new GridLayout(0, 8));
        chessBoard.setBorder(new LineBorder(Color.BLACK));
        gui.add(chessBoard);
    }
}
