package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton checkButton;
    private JLabel yearLabel;
    public static void main(String[] args) {
        LeapYearGUI year = new LeapYearGUI();
        year.setContentPane(year.pnlMain);
        year.setSize(400, 150);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setVisible(true);
    }
    public LeapYearGUI() {

    }
}
