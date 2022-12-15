package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber;
    private JTextField lblResult;
    private JButton btnCompute;
    private JPanel pnlMain;
    private JComboBox cbOperations;

    public static void main(String[] args) {
        SimpleCalcGUI frame = new SimpleCalcGUI();
        frame.setContentPane(frame.pnlMain);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operation = cbOperations.getSelectedItem().toString();
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber.getText());
                double result;
                switch (operation) {
                    case "-":
                        result = num1 - num2;
                        lblResult.setText(String.format("%.2f", result));
                        break;
                    case "+":
                        result = num1 + num2;
                        lblResult.setText(String.format("%.2f", result));
                        break;
                    case "*":
                        result = num1 * num2;
                        lblResult.setText(String.format("%.2f", result));
                        break;
                    case "/":
                        result = num1 / num2;
                        lblResult.setText(String.format("%.2f", result));
                        break;
                }

            }
        });
    }
}
