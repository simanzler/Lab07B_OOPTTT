import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {
    JPanel mainPnl;
    JPanel topPnl;
    JPanel bottomPnl;
    JTextField out;
    JButton quit;
    public TicTacToe(){
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());
        CreateTopPanel();
        mainPnl.add(topPnl, BorderLayout.NORTH);

        createBottomPanel();
        mainPnl.add(bottomPnl, BorderLayout.SOUTH);

        add(mainPnl);

        setTitle("Tic Tac Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }
    private void CreateTopPanel(){
        topPnl = new JPanel(new GridLayout(3,3));
        out = new JTextField(" ");
        Board board = new Board(topPnl,mainPnl,out);
    }
    private void createBottomPanel(){
        bottomPnl = new JPanel();
        quit = new JButton("Quit");
        quit.addActionListener((ActionEvent ae) -> System.exit(0));

        bottomPnl.add(out);
        bottomPnl.add(quit);
    }

    public static void main(String[] args){
        JFrame frame = new TicTacToe();
    }
}
