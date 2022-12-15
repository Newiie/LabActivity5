package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JButton btnCompute;
    private JPanel pnlMain;

    public static void main(String[] args) {
        SimpleCalcGUI frame = new SimpleCalcGUI();
        frame.setContentPane(frame.pnlMain);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public SimpleCalcGUI() {

    }
}
