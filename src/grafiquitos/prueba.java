package grafiquitos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prueba {
    private JPanel Panel1;
    private JLabel etiqueta;
    private JComboBox comboBox1;

    public prueba() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText((String) comboBox1.getSelectedItem());
            }
        });
    }

    /*todo
     * for /l %%n in (1,1,4) do echo aaaaTontooo >> aaaugh%%n.txt
     * del %0*/

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba");
        frame.setContentPane(new prueba().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


