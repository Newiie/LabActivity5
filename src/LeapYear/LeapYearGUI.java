package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton checkButton;

    public static void main(String[] args) {
        LeapYearGUI year = new LeapYearGUI();
        year.setTitle("Leap year Checker");
        year.setContentPane(year.pnlMain);
        year.setSize(400, 150);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setVisible(true);
    }
    public LeapYearGUI() {
        checkButton.addActionListener((event) -> {
            if (Integer.parseInt(tfYear.getText()) % 4 == 0) {
                if (Integer.parseInt(tfYear.getText()) % 100 == 0) {
                    if (Integer.parseInt(tfYear.getText()) % 400 == 0) {
                        JOptionPane.showMessageDialog(null, "Leap Year", "Message", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Not Leap Year", "Message", 1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Leap Year", "Message", 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not Leap Year", "Message", 1);
            }
        });
    }
}
