package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel JPanel1;
    private JCheckBox cPizza;
    private JPanel pnlMain;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public static void main(String[] args) {
        FoodOrderGUI frame = new FoodOrderGUI();
        frame.setContentPane(frame.pnlMain);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public FoodOrderGUI() {

    }
}
