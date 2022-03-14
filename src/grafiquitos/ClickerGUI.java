package grafiquitos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerGUI {
    private JButton cookButton;
    private JButton mSButton;
    private JLabel Cookies;
    private JLabel Speed;
    private JPanel mainPanel;


    private int counter1 = 0;
    private int counter2 = 0;

    public ClickerGUI() {
        cookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                counter1++;
                Cookies.setText("You have " + String.valueOf(counter1) + " cookies");

            }
        });
        mSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                counter2++;
                Speed.setText("Speed: " + String.valueOf(counter2) + "m/s");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ClickerGUI");
        frame.setContentPane(new ClickerGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
