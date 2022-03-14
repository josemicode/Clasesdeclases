package grafiquitos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class TraductorGUI {
    private JPanel main;
    private JComboBox Ingles;
    private JLabel Result;

    HashMap<String, String> spaniardias = new HashMap<String, String>();


    public TraductorGUI() {

        spaniardias.put("Keyboard", "Teclado");
        spaniardias.put("Glasses", "Gafas");
        spaniardias.put("Chemistry", "Química");
        spaniardias.put("Binding", "Vínculo");
        spaniardias.put("Slash", "Corte");
        spaniardias.put("Pyramid", "Pirámide");
        spaniardias.put("Knuckle", "Nudillo");
        spaniardias.put("Fingerprint", "Huella dactilar");
        spaniardias.put("Bazooka", "lanzacohetes");
        spaniardias.put("茶","Té cha");

        Ingles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result.setText(spaniardias.get(Ingles.getSelectedItem()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TraductorGUI");
        frame.setContentPane(new TraductorGUI().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
