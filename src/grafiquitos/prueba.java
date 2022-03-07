package grafiquitos;

import javax.swing.*;

public class prueba {
    private JPanel Panel1;
    private JLabel etiqueta;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba");
        frame.setContentPane(new prueba().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


