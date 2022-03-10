package grafiquitos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMCGUI {
    private JTextField Altura;
    private JPanel mainPanel;
    private JTextField Peso;
    private JLabel Tx1;
    private JLabel Tx2;
    private JLabel Result;
    private JButton calcularButton;


    private double altura;
    private double peso;
    private double res;

    public IMCGUI() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altura = Double.parseDouble(Altura.getText());
                peso = Double.parseDouble(Peso.getText());

                res = peso/(altura*altura);

                Result.setText(String.valueOf(res));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IMC");
        frame.setContentPane(new IMCGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
