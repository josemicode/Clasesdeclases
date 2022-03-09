package grafiquitos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class unguento {
    private JButton OWO;
    private JPanel panel1;
    private JButton uwu;
    private JLabel Texto;


    public unguento() {
        uwu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Texto.setText("uwu");
            }
        });
        OWO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Texto.setText("OWO");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("unguento");
        frame.setContentPane(new unguento().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
