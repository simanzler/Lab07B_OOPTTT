import javax.swing.*;

public class TicTacToeButton extends JButton {
    int row;
    int col;

    public TicTacToeButton(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
